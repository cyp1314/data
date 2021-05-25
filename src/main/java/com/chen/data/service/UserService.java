package com.chen.data.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.data.entity.User;
import org.springframework.stereotype.Service;


public interface UserService extends IService<User> {
    Page<User> selectAll(Page<User> page);
}
