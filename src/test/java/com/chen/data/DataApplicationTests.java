package com.chen.data;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.data.config.DataFilterMetaData;
import com.chen.data.entity.User;
import com.chen.data.enums.DataFilterTypeEnum;
import com.chen.data.service.UserService;
import com.chen.data.util.DataFilterThreadLocal;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@MapperScan("com.chen.data.mapper.*")
@SpringBootTest
class DataApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testDataFilter() {
        DataFilterThreadLocal.set(DataFilterMetaData.builder().filterType(DataFilterTypeEnum.SELF).userId(1L).build());
        Page<User> page = new Page<>();
        Page<User> page1 = userService.selectAll(page);
        System.out.println(JSON.toJSONString(page1));
    }

    @Test
    public void testDataFilterByService() {
        DataFilterThreadLocal.set(DataFilterMetaData.builder().filterType(DataFilterTypeEnum.SELF).userId(1L).build());
        Page<User> page = new Page<>();
        Page<User> page1 = userService.page(page);
        System.out.println(JSON.toJSONString(page1));
    }


    @Test
    void save() {
        User user = new User();
        user.setName("A");
        user.setCreateBy("A");
        user.setCreatDeptId("1");

        userService.save(user);
    }

}
