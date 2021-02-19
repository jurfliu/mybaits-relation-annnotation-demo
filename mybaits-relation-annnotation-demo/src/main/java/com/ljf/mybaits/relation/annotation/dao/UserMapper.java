package com.ljf.mybaits.relation.annotation.dao;
import com.ljf.mybaits.relation.annotation.domain.User;
import org.apache.ibatis.annotations.*;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    @Insert("insert into tb_users values(#{id},#{userName},#{birthday})")
    public void save(User user) throws IOException;
    @Update("update tb_users set user_name=#{userName} where id=#{id}")
    public void update(User user);
    @Delete("delete from tb_users where id=#{id}")
    public void delete(int id);
    @Select("select id,user_name userName,birthday from tb_users where id=#{id}")
    public User findById(int id);
    @Select("select id,user_name userName,birthday   from tb_users")
    public List<User> findAll();
    //配置多对1的关系
    @Select("SELECT * FROM tb_users")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "birthday",property = "birthday"),
            @Result(
                    property = "orderList",
                    column = "id",
                    javaType = List.class,
                    //一对多的配置，多是order
                    many = @Many(select = "com.ljf.mybaits.relation.annotation.dao.OrderMapper.findByUid")
            )
    })
    public List<User> findUserAndRoleAll();

}

