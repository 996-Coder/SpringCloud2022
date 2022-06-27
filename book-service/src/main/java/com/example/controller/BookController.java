package com.example.controller;

import com.example.bean.Book;
import com.example.bean.ResponseObject;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: michael
 * @Date: 2022/6/21 17:14
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    ResponseEntity<ResponseObject> addBook(@RequestBody Book book) {
        ResponseObject responseObject = new ResponseObject();
        if (book == null) {
            responseObject.setCode(400);
            responseObject.setMessage("");
            return new ResponseEntity<>(responseObject, HttpStatus.BAD_REQUEST);
        }
        if (book.getName() == null) {
            responseObject.setCode(400);
            responseObject.setMessage("书名不能为空！");
            return new ResponseEntity<>(responseObject, HttpStatus.BAD_REQUEST);
        }
        if (book.getAuthor() == null) {
            responseObject.setCode(400);
            responseObject.setMessage("作者不能为空！");
            return new ResponseEntity<>(responseObject, HttpStatus.BAD_REQUEST);
        }
        if (book.getSynopsis() == null) {
            responseObject.setCode(400);
            responseObject.setMessage("简介不能为空！");
            return new ResponseEntity<>(responseObject, HttpStatus.BAD_REQUEST);
        }
        Integer result = bookService.insertBook(book);
        if (result < 0) {
            responseObject.setCode(500);
            responseObject.setMessage("插入失败");
            return new ResponseEntity<>(responseObject, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        responseObject.setCode(200);
        responseObject.setMessage("插入成功");
        return new ResponseEntity<>(responseObject, HttpStatus.OK);
    }
}
