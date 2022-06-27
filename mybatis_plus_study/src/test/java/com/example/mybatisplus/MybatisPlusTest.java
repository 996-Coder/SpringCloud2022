package com.example.mybatisplus;

import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * @Description:
 * @Author: michael
 * @Date: 2022/6/27 11:08
 */
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();
        user.setName("test");
        user.setAge(10);
        user.setEmail("xxxxxxxxx@xxx.com");
        Integer result = userMapper.insert(user);
        System.out.println(result);
        System.out.println(user.getId());
    }

    @Test
    void testDeleteById() {
        Integer result = userMapper.deleteById(1541309183629447169L);
        System.out.println(result);
    }

    @Test
    void testDeleteByMap() {
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("xxxxxxxxx@xxx.com");
        userMapper.insert(user);

        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 23);
        // DELETE FROM user WHERE name = '张三' AND age = 23;
        Integer result = userMapper.deleteByMap(map);
        System.out.println(result);
    }

    @Test
    void testDeleteBatchIds() {
        /*List<Long> idList = new ArrayList();
        idList.add(1541311809456693250L);
        idList.add(1541312144485003265L);
        idList.add(1541312204446859265L);*/
        List<Long> idList = Arrays.asList(1541311809456693250L, 1541312144485003265L, 1541312204446859265L);
        // DELETE FROM user WHERE id IN ( 1541311809456693250 , 1541312144485003265 , 1541312204446859265 );
        Integer result = userMapper.deleteBatchIds(idList);
        System.out.println(result);
    }

    @Test
    void testUpdateById() {
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("xxxxxxxxx@xxx.com");
        userMapper.insert(user);
        System.out.println(user.getId());

        user.setEmail("lisi@qq.com");
        user.setName("李四");
        // UPDATE user SET name='李四', age=23, email='lisi@qq.com' WHERE id=1541316064947077121;
        Integer result = userMapper.updateById(user);
        System.out.println(result);
    }

    @Test
    void testSelectById() {
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("xxxxxxxxx@xxx.com");
        userMapper.insert(user);

        // SELECT id,name,age,email FROM user WHERE id=?
        User savedUser = userMapper.selectById(user.getId());
        System.out.println(savedUser.toString());
    }

    @Test
    void testSelectBatchIds() {
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(23);
        user1.setEmail("xxxxxxxxx@xxx.com");
        userMapper.insert(user1);
        User user2 = new User();
        user2.setName("里斯");
        user2.setAge(24);
        user2.setEmail("xxxxxxxxx@xxx.com");
        userMapper.insert(user2);
        User user3 = new User();
        user3.setName("王五");
        user3.setAge(25);
        user3.setEmail("xxxxxxxxx@xxx.com");
        userMapper.insert(user3);

        List<Long> idList = Arrays.asList(user1.getId(), user2.getId(), user3.getId());
        // SELECT id,name,age,email FROM user WHERE id IN ( ? , ? , ? )
        List<User> userList = userMapper.selectBatchIds(idList);
        System.out.println(userList);
    }

    @Test
    void testSelectByMap() {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("name", "张三");
        columnMap.put("age", 23);
        // SELECT id,name,age,email FROM user WHERE name = ? AND age = ?
        List<User> userList = userMapper.selectByMap(columnMap);
        System.out.println(userList);
    }

    @Test
    void testSelectList() {
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
