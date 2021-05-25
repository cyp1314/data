package com.chen.data.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.data.entity.User;
import com.chen.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public Page<User> select(){
        Page<User> userPage = userService.page(new Page<>(1, 2));
        return userPage;
    }

    @GetMapping("/all")
    public List<User> all(){
        Page<User> userPage = userService.selectAll(new Page<>());
        return userPage.getRecords();
    }
}
