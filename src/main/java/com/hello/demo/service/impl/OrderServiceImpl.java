package com.hello.demo.service.impl;

import com.hello.demo.dao.OrderDao;
import com.hello.demo.entity.Order;
import com.hello.demo.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;


    @Override
    public List<Order> getOrderList() {
        return orderDao.queryOrder();
    }

    @Override
    public Order getOrderById(int oid) {
        return orderDao.queryOrderById(oid);
    }
}
