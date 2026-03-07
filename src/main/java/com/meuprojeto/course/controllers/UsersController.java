package com.meuprojeto.course.controllers;

import com.meuprojeto.course.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @GetMapping
    public ResponseEntity<Users> findAll() {
        Users u = new Users(1L, "igor", "igor@gmail.com", "996053764", "1234456");

        return ResponseEntity.ok().body(u);
    }
}
