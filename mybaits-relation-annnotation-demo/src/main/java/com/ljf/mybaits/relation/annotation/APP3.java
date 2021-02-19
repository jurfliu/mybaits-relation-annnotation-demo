package com.ljf.mybaits.relation.annotation;

import com.ljf.mybaits.relation.annotation.domain.User;
import com.ljf.mybaits.relation.annotation.service.UserService;
import com.ljf.mybaits.relation.annotation.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: APP3
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/19 09:53:12 
 * @Version: V1.0
 **/
public class APP3 {
    public static void main(String[] args) throws IOException {
        UserService us=new UserServiceImpl();
      List<User> userList=  us.findUserAndOrderAll();
      for(User u:userList){
          System.out.println("u:"+u);
      }
    }
}
