package com.example.day14springmvc.controller;

import com.example.day14springmvc.model.User;
import com.example.day14springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/mainapp")
public class AppController {

    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public String loginValid(@ModelAttribute User user) {
        System.out.println("memms");

        if (userService.loginValidate(user)) {
            return "success";
        } else {
            return "fail";
        }

    }

    @PostMapping("/register")
    public String registerValid(@RequestBody User user) {

        if (userService.registerValidate(user)) {
            return "User created successfully";
        } else {
            return "error creating user";
        }

    }

    @GetMapping("/users")
    public List<User> loadAll() {
        return userService.loadAll();
    }

    @GetMapping("/users/{uname}")
    public User loadUser(@PathVariable String uname) {
        return userService.loadUserData(uname);
    }

    @PutMapping("/users/{uname}")
    public String updateUser(@PathVariable String uname, User user) {
        return userService.updateUserData(uname, user);
    }

    @DeleteMapping("/users/{uname}")
    public String deleteUser(@PathVariable String uname) {
        return userService.deleteUserData(uname);
    }

}
