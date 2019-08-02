package com.example.luckyMoney;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.apache.catalina.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.Transaction;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

public class MybatisLoad {
    public static void main(String[] args) {
        String resource = "mybatis-cfg.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sessionFactory.openSession();
            LimitConfig limitConfig = sqlSession.selectOne("com.luo.dao.UserDao.getUserById", 1);
            LimitMoneyInterface limitConfig1 = sqlSession.getMapper(LimitMoneyInterface.class);
            limitConfig1.insertLimit(limitConfig);
           // Transaction tx = sessionFactory.
        }catch (IOException e) {
            e.getMessage();
        }
    }
}
