package com.chen.data.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.data.entity.User;
import com.chen.data.mapper.UserMapper;
import com.chen.data.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public Page<User> selectAll(Page<User> page) {
        return this.baseMapper.selectAll(page);
    }
}
