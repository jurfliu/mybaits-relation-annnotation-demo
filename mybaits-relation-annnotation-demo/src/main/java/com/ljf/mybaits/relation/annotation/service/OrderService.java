package com.ljf.mybaits.relation.annotation.service;

import com.ljf.mybaits.relation.annotation.domain.Order;

import java.io.IOException;
import java.util.List;

public interface OrderService {
    public List<Order> findAll() throws IOException;
    public List<Order> findAll2() throws IOException;
}
