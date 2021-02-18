package com.ljf.mybaits.relation.annotation.dao;
import com.ljf.mybaits.relation.annotation.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
}

