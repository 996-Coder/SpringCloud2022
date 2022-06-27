package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: michael
 * @Date: 2022/6/24 11:23
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
