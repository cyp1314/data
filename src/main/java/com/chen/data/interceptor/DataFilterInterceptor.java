package com.chen.data.interceptor;

import com.chen.data.config.DataFilterMetaData;
import com.chen.data.enums.DataFilterTypeEnum;
import com.chen.data.util.DataFilterThreadLocal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class DataFilterInterceptor implements HandlerInterceptor {
    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>  进入拦截器   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String uid = request.getHeader("uid");
        DataFilterThreadLocal.set(DataFilterMetaData.builder().filterType(DataFilterTypeEnum.SELF).userId(Long.parseLong(uid)).build());
        return true;
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mv) throws Exception {

    }

    /*
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行
     * （主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex) throws Exception {
        DataFilterThreadLocal.clear();
    }
}
