package com.examensarbete.userwatchlist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
