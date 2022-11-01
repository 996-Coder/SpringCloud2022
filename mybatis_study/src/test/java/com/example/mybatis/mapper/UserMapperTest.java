package com.example.mybatis.mapper;

import com.example.mybatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author: michael
 * @Date: 2022/6/27 17:04
 */
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsertUser(){
        Integer result = userMapper.insertUser();
        System.out.println(result);
    }

    @Test
    void testSelectUserByUsername(){
        String username = "张三";
        User user = userMapper.selectUserByUsername(username);
        System.out.println(user);
    }
}
