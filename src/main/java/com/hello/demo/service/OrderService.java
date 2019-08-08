package com.hello.demo.service;

import com.hello.demo.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderList();
    Order getOrderById(int oid);
}
