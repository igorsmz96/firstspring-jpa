package com.meuprojeto.course.config;

import com.meuprojeto.course.entities.Order;
import com.meuprojeto.course.entities.User;
import com.meuprojeto.course.entities.enums.OrderStatus;
import com.meuprojeto.course.repositories.OrderRepository;
import com.meuprojeto.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");


        List<Order> orders = List.of(
                new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELLED ,u1),
                new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.DELIVERED, u2),
                new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.PAID, u1)

        );

        userRepository.saveAll(List.of(u1, u2));
        orderRepository.saveAll(orders);
    }


    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    public TestConfig(UserRepository userRepository, OrderRepository orderRepository){
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }


    }



