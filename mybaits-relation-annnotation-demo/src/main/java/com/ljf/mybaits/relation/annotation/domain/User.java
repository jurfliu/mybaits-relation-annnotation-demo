package com.ljf.mybaits.relation.annotation.domain;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 20:02:38 
 * @Version: V1.0
 **/
public class User {
    private int id;
    private String userName;
    private Date birthday;
     //描述的是当前用户具有的订单
    private List<Order> orderList;
    public List<Order> getOrderList() {
        return orderList;
    }
    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    //当前用户具备哪些角色
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", orderList=" + orderList +
                ", roleList=" + roleList +
                '}';
    }
}
