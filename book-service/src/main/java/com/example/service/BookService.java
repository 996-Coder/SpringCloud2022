package com.example.service;

import com.example.bean.Book;
import com.example.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: michael
 * @Date: 2022/6/21 17:24
 */
@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public Integer insertBook(Book book) {
        return bookMapper.insert(book);
    }

    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

//    public Book getBookByName(String name){
//        Book bookMapper.getOneByName();
//    }
}
