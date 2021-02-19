package com.ljf.mybaits.relation.annotation;

import com.ljf.mybaits.relation.annotation.domain.User;
import com.ljf.mybaits.relation.annotation.service.UserService;
import com.ljf.mybaits.relation.annotation.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: APP4
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/19 10:43:23 
 * @Version: V1.0
 **/
public class APP4 {
    public static void main(String[] args) throws IOException {
        UserService us=new UserServiceImpl();
        List<User> userList=  us.findUserAndRoleAll();
        for(User u:userList){
            System.out.println("u:"+u);
        }
    }
}
