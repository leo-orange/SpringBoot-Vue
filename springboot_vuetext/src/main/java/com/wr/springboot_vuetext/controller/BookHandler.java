package com.wr.springboot_vuetext.controller;

import com.wr.springboot_vuetext.Repository.BookRepository;
import com.wr.springboot_vuetext.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookHandler {
    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/findAll")
    private List<Book> findAll(){
        return bookRepository.findAll();
    }
}
