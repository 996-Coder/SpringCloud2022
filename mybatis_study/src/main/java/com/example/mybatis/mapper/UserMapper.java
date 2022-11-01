package com.example.mybatis.mapper;

import com.example.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: michael
 * @Date: 2022/6/24 11:23
 */
@Mapper
public interface UserMapper {
    /**
     * Inserts a user into the database.
     *
     * @return The number of rows affected by the query.
     */
    int insertUser();

    User selectUserByUsername(String username);
}
