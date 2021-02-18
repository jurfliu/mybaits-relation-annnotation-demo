package com.ljf.mybaits.relation.annotation.dao;

import com.ljf.mybaits.relation.annotation.domain.Order;
import com.ljf.mybaits.relation.annotation.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {
    //方式一
    @Select("select * from tb_orders")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "order_time",property = "orderTime"),
            @Result(column = "total",property = "total"),
            @Result(
                    property = "user", //要封装的属性名称
                    column = "uid", //uid为tb_orders表中的字段，表示是外键，是关联用户表tb_user
                    javaType = User.class, //要封装的实体类型
                    //select属性 代表查询那个接口的方法获得数据
                    one = @One(select = "com.ljf.mybaits.relation.annotation.dao.UserMapper.findById")
            )
    })
    public List<Order> findAll();
    //方式二
   @Select("   SELECT o.id oid,o.order_time,o.total,u.id,u.user_name,u.birthday FROM tb_orders o,tb_users u WHERE o.uid=u.id")
    @Results({
            @Result(column = "oid",property = "id"),
            @Result(column = "order_time",property = "orderTime"),
            @Result(column = "total",property = "total"),
            @Result(column = "uid",property = "user.id"),
            @Result(column = "user_name",property = "user.userName"),
            @Result(column = "birthday",property = "user.birthday")
    })
    public List<Order> findAll2();
}
