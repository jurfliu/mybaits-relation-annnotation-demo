package com.ljf.mybaits.plugs.pagehelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljf.mybaits.plugs.pagehelper.bean.User;
import com.ljf.mybaits.plugs.pagehelper.dao.UserMapper;
import com.ljf.mybaits.plugs.pagehelper.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/30 22:00:02 
 * @Version: V1.0
 **/
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() throws IOException {
        //加载核心配置文件
        InputStream resourcesAsStream= Resources.getResourceAsStream("mybaitsConfig.xml");
        //获得sqlsession 工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourcesAsStream);
        //获得sqlsession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //执行sql
        UserMapper orgMapper=sqlSession.getMapper(UserMapper.class);
        //设置分页参数
        PageHelper.startPage(1,1);
        List<User> userList=orgMapper.findAll();
        //获得与分页相关参数
        PageInfo<User> pageInfo=new PageInfo<User>(userList);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("煤业显示条数："+pageInfo.getPageSize());
        System.out.println("总条数："+pageInfo.getTotal());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("是否第一个:："+pageInfo.isIsFirstPage());
        System.out.println("下一页："+pageInfo.isIsLastPage());
        //mybaits 执行更新操作，提交事务
        sqlSession.commit();
        //关闭释放资源
        sqlSession.close();
        return userList;
    }
}
