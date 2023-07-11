package com.pacomolina.dockerized.postgresql.controllers;

import com.pacomolina.dockerized.postgresql.repositories.UserRepository;
import com.pacomolina.dockerized.postgresql.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/users")

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return  userRepository.findAll();
    }


    // Devolvemos usuarios por id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    // Creamos usuarios
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }


}
