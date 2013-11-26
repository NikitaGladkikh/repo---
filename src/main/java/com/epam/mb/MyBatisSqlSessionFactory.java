package com.epam.mb;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class MyBatisSqlSessionFactory {
    
    private static SqlSessionFactory sqlSessionFactory;
    
    public static SqlSessionFactory getSqlSessionFactory() {
        
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("resources\\com\\epam\\mb\\mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }
    
    public static SqlSession openSession() {
        return getSqlSessionFactory().openSession();
    }
    
}