package com.ajay.OrderService.controller;


import com.ajay.OrderService.constraint.ValidId;
import com.ajay.OrderService.model.Customer;
import com.ajay.OrderService.model.Order;
import com.ajay.OrderService.model.OrderItem;
import com.ajay.OrderService.repository.CassandraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@Validated
public class OrderController {
@Autowired
    CassandraRepository repo;
    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> retrieveCustomer(@PathVariable("id")   String id) {
        Optional<Customer> customer=repo.findById(id);
        return  ResponseEntity.ok(customer.get());
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> retrieveOrder(@PathVariable("id") @ValidId  String id)
    {
        log.info("this is a valid id");
        Optional<Order> order =null;
        if(id.startsWith("o")) {
order = populateOrderList().stream().filter(o -> o.getOrderId().equals(id)).findFirst();
}
        else
        {
            order=populateOrderList().stream().filter(o -> o.getCustomerId().equals(id)).findFirst();
        }
return ResponseEntity.ok().body(order.get());
    }


     List<OrderItem> populateitem()
    {
        List<OrderItem> itemList=new ArrayList<>();
        itemList.add( new OrderItem(1001,13.99,"Apples"));
        itemList.add( new OrderItem(1002,9.99," Bananas"));
        itemList.add( new OrderItem(1003,11.99,"Strawberries"));
        itemList.add( new OrderItem(1004,15.99,"Cherries"));
       return itemList;
    }
    List<Order> populateOrderList()
    {
        List<Order> orderList=new ArrayList<>();
        orderList.add( new Order("o120009","c7484848",populateitem(), new Date()));
        orderList.add( new Order("o120009","c7484848",populateitem(), new Date()));
        orderList.add( new Order("o120009","c7484848",populateitem(), new Date()));
        orderList.add( new Order("o120009","c7484848",populateitem(), new Date()));
        return orderList;
    }

}


