package com.ljf.mybaits.plugs.pagehelper.dao;

import com.ljf.mybaits.plugs.pagehelper.bean.User;


import java.io.IOException;
import java.util.List;

public interface UserMapper {
    List<User> findAll() throws IOException;
    List<User> findByIds(List<Integer> dataList) throws IOException;
}

