package com.ljf.mybaits.relation.annotation;

import com.ljf.mybaits.relation.annotation.domain.Order;
import com.ljf.mybaits.relation.annotation.service.OrderService;
import com.ljf.mybaits.relation.annotation.service.impl.OrderServiceImpl;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: APP2
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/18 22:02:14 
 * @Version: V1.0
 **/
public class APP2 {
    public static void main(String[] args) throws IOException {
        OrderService orderService=new OrderServiceImpl();
        List<Order> orderList=orderService.findAll();
        for(Order order:orderList){
            System.out.println("order:"+order);
        }
        System.out.println("============");
        List<Order> orderList2=orderService.findAll2();
        for(Order order:orderList2){
            System.out.println("order2:"+order);
        }
    }
}
