package com.ljf.mybaits.plugs.pagehelper.service;

import com.ljf.mybaits.plugs.pagehelper.bean.User;


import java.io.IOException;
import java.util.List;

public interface UserService {
    List<User> findAll() throws IOException;
}
