package com.ljf.mybaits.plugs.pagehelper;

import com.ljf.mybaits.plugs.pagehelper.bean.User;
import com.ljf.mybaits.plugs.pagehelper.service.UserService;
import com.ljf.mybaits.plugs.pagehelper.service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        UserService os=new UserServiceImpl();
        List<User> orgList=os.findAll();
        System.out.println("orglist:"+orgList);
        for(User u:orgList){
            System.out.println("u:"+u.getUserName());
        }
        System.out.println("....");
        System.out.println( "Hello World!" );
    }
}
