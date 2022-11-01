package com.example.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: michael
 * @Date: 2022/6/24 11:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Character sex;
    private String email;
}
