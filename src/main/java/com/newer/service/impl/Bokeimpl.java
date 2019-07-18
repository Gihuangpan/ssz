package com.newer.service.impl;

import com.newer.Dao.BlogDao;
import com.newer.service.Bokeservice;
import pojo.Boke;

public class Bokeimpl implements Bokeservice {
    private BlogDao blogDao;

    public void setBlogDao(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    @Override
    public void add(Boke boke) {
       // blogDao.add(boke);
        System.out.println("查看："+boke.getRorle()+","+boke.getTitle());
    }

    @Override
    public int delet(Boke boke) {
       // blogDao.delet(boke);
        System.out.println("修改："+boke.getTitle()+","+boke.getRorle());
        return 1;
    }


}
