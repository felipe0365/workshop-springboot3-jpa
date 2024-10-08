package com.compassuol.course.resources;

import com.compassuol.course.entities.Order;
import com.compassuol.course.entities.User;
import com.compassuol.course.repositories.OrderRepository;
import com.compassuol.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderRepository service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Order>> findById(@PathVariable Long id) {
        Optional<Order> order = service.findById(id);
        return ResponseEntity.ok().body(order);
    }

}
