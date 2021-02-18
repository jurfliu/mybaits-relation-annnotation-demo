package com.ljf.mybaits.relation.annotation.service;

import com.ljf.mybaits.relation.annotation.domain.User;
import org.apache.ibatis.annotations.Select;

import java.io.IOException;
import java.util.List;

public interface UserService {
    public void save(User user) throws IOException;
    public void update(User user) throws IOException;
    public void delete(int id) throws IOException;
    public User findById(int id) throws IOException;
    public List<User> findAll() throws IOException;
}
