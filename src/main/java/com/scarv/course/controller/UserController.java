package com.scarv.course.controller;

import com.scarv.course.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Fernando", "qj5wz@example.com", "999999999", "123456");
        return ResponseEntity.ok().body(user);
    }
}
