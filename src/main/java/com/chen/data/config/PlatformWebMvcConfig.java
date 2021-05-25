package com.chen.data.config;

import com.chen.data.interceptor.DataFilterInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PlatformWebMvcConfig implements WebMvcConfigurer {

    @Autowired
    DataFilterInterceptor dataFilterInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(dataFilterInterceptor).addPathPatterns("/user/**");
    }
}
