package com.ljf.mybaits.relation.annotation.service.impl;

import com.ljf.mybaits.relation.annotation.dao.OrderMapper;
import com.ljf.mybaits.relation.annotation.dao.UserMapper;
import com.ljf.mybaits.relation.annotation.domain.Order;
import com.ljf.mybaits.relation.annotation.service.OrderService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 22:03:22 
 * @Version: V1.0
 **/
public class OrderServiceImpl implements OrderService {
    private OrderMapper mapper;
    @Override
    public List<Order> findAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(OrderMapper.class);
       List<Order> orderList= mapper.findAll();
       return orderList;
    }

    @Override
    public List<Order> findAll2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList= mapper.findAll2();
        return orderList;
    }
}
