package com.newer.service.impl;

import com.newer.service.Bookservice;
import pojo.Book;

public class Bookimpl implements Bookservice {

    @Override
    public void addBook(Book book) {

        System.out.println("新增"+book.getBookname()+","+book.getAuthor()
        +","+book.getPrice());
    }

    @Override
    public Book updaBook(Book book) {
        System.out.println("修改"+book.getBookname()+","+book.getAuthor()
                +","+book.getPrice());
        book.setBookname("葵花宝典");
        book.setPrice(250d);
        return book;
    }
}
