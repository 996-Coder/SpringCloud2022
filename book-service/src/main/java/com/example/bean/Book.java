package com.example.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author michael
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_book")
public class Book {
    private Integer id;
    private String name;
    private String author;
    private String synopsis;
}
