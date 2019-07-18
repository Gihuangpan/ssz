package com.newer.Dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Aspecir {
    private static SqlSessionFactory sqlSessionFactory;
    static {
            try {
                String resouce="xml";
                InputStream stream=Resources.getResourceAsStream(resouce);
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

