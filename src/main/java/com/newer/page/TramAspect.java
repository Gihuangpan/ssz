package com.newer.page;

import org.aspectj.lang.JoinPoint;

public class TramAspect {
    public void open(){

        System.out.println("开启事务");
    }
    public void tram(){
        System.out.println("关闭事务");
    }

}
