package com.chen.data.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.data.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {
    /**
     * InterceptorIgnore 1:关闭；0：打开
     * @param page
     * @return
     */
    @InterceptorIgnore(dataPermission = "1")
    @Select("select  * from user ")
    Page<User> selectAll(Page page);

}
