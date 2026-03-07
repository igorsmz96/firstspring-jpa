package com.meuprojeto.course.repositories;

import com.meuprojeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
