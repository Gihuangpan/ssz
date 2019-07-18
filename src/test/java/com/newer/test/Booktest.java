package com.newer.test;

import com.newer.service.Bookservice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Book;

public class Booktest {
    private  Bookservice bookservice;


    @Before
    public void init(){
        ApplicationContext atx=new ClassPathXmlApplicationContext("sprt.xml");
       bookservice=atx.getBean("bookservilce",Bookservice.class);
    }


    @Test
    public void add(){
        bookservice.addBook(new Book("葵花宝典","笑笑",250d));
    }
}
