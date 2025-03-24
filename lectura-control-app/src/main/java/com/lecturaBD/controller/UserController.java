package com.lecturaBD.controller;

import com.lecturaBD.entity.User;
import com.lecturaBD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable UUID id){
        return userService.getUserById(id);
    }
    @GetMapping("/email/{email}")
    public Optional<User> getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }
    @GetMapping("/firebaseId/{firebaseUid}")
    public Optional<User> getUserByFirebaseId(@PathVariable String firebaseUid){
        return userService.getUserByFirebaseId(firebaseUid);
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
