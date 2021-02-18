package com.ljf.mybaits.relation.annotation;

import com.ljf.mybaits.relation.annotation.domain.User;
import com.ljf.mybaits.relation.annotation.service.UserService;
import com.ljf.mybaits.relation.annotation.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //add();
      //  update();
        findAll();
        findSingleUser();
       // delete();
        findSingleUser();
        System.out.println( "Hello World!" );
    }
    /**
    * @author liujianfu
    * @description    添加
    * @date 2021/2/18 20:45
    * @param []
    * @return void
    */
    public static  void add() throws IOException {
        UserService us=new UserServiceImpl();
        User user = new User();
        user.setUserName("beijing");
        user.setId(23);
        user.setBirthday(new Date());
        us.save(user);
    }
    //修改
    public static void update() throws IOException {
        UserService us=new UserServiceImpl();
        User user = new User();
        user.setId(73);
         user.setUserName("tianjin");
        us.update(user);
    }
    //查询
    public static void findAll() throws IOException {
        UserService us=new UserServiceImpl();
       List<User> userList= us.findAll();
       for(User u:userList){
           System.out.println("u:"+u);
       }
    }
    //单个查询
    public static void findSingleUser() throws IOException {
        UserService us=new UserServiceImpl();
         User u= us.findById(23);
         System.out.println("u:"+u);
    }
    //删除
    public static  void delete() throws IOException {
        UserService us=new UserServiceImpl();
         us.delete(23);
    }
}
