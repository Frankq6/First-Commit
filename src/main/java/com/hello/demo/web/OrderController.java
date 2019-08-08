package com.hello.demo.web;

import com.hello.demo.entity.Order;
import com.hello.demo.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/listorder", method = RequestMethod.GET)
    private Map<String, Object> listorder() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Order> list = orderService.getOrderList();
        modelMap.put("orderlist", list);
        return modelMap;
    }

    @RequestMapping(value = "/getorderbyid", method = RequestMethod.GET)
    private Map<String, Object> getOrderById(Integer oid){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Order order = orderService.getOrderById(oid);
        modelMap.put("order", order);
        return modelMap;
    }
}
