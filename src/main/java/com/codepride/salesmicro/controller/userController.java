package com.codepride.salesmicro.controller;


import com.codepride.salesmicro.model.user;
import com.codepride.salesmicro.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    @PostMapping("/add")
    public String add(@RequestBody user user){
        userService.saveUser(user);
        return  "New user added succefully";
    }

}
