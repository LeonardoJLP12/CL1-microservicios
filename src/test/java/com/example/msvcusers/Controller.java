package com.example.msvcusers.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @Value("${server.port}")
    private int port;

    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1L, "12345678", "Cesar", "Santos", new Date(), port),
                new User(2L, "87654321", "Ana", "Lopez", new Date(), port)
        );
    }
}

