package com.newer.test;

import com.newer.service.Bokeservice;
import com.newer.service.Bookservice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Boke;
import pojo.Book;

public class BokeTest {
    private Bokeservice bokeservice;
    @Before
    public void init(){
        ApplicationContext atx=new ClassPathXmlApplicationContext("Boke.xml");
        bokeservice=atx.getBean("bokimpl",Bokeservice.class);
    }

    @Test
    public void add(){
      bokeservice.delet(new Boke("management","oooo"));
    }
}
