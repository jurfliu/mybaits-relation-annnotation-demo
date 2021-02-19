package com.ljf.mybaits.relation.annotation.service.impl;

import com.ljf.mybaits.relation.annotation.dao.UserMapper;
import com.ljf.mybaits.relation.annotation.domain.User;
import com.ljf.mybaits.relation.annotation.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 20:17:17 
 * @Version: V1.0
 **/
public class UserServiceImpl implements UserService {
    private UserMapper mapper;
    @Override
    public void save(User user) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
        mapper.save(user);
    }

    @Override
    public void update(User user) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update(user);
    }

    @Override
    public void delete(int id) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(id);
    }

    @Override
    public User findById(int id) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
       User u= mapper.findById(id);
        return u;
    }

    @Override
    public List<User> findAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList=mapper.findAll();
        return userList;
    }


    @Override
    public List<User> findUserAndRoleAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList=mapper.findUserAndRoleAll();
        return userList;
    }

    @Override
    public List<User> findUserAndOrderAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList=mapper.findUserAndOrderAll();
        return userList;
    }
}
