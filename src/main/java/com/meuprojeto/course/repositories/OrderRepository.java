package com.meuprojeto.course.repositories;

import com.meuprojeto.course.entities.Order;
import com.meuprojeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
