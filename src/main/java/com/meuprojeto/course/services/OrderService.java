package com.meuprojeto.course.services;

import com.meuprojeto.course.entities.Order;
import com.meuprojeto.course.entities.enums.OrderStatus;
import com.meuprojeto.course.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll(){

        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> order = repository.findById(id);
        return order.get();

    }



}
