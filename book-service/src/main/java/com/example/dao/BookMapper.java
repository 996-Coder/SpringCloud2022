package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
    @Select("select * from t_book where id = #{id}")
    Book getBookById(int bid);

    /**
     * Get a book by its name.
     *
     * @param name The name of the book you want to get.
     * @return A Book object
     */
    @Select("select * from t_book where name = #{name}")
    Book getOneByName(String name);
}
