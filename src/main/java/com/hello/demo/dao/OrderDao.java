package com.hello.demo.dao;

import com.hello.demo.entity.Order;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderDao {
    List<Order> queryOrder();
    Order queryOrderById(int oid);
}
