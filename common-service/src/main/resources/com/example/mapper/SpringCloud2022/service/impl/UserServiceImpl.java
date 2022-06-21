package com.example.mapper.SpringCloud2022.service.impl;

import com.example.mapper.SpringCloud2022.entity.User;
import com.example.mapper.SpringCloud2022.mapper.UserMapper;
import com.example.mapper.SpringCloud2022.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author michael
 * @since 2022-05-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
