package com.codepride.salesmicro.controller;


import com.codepride.salesmicro.model.user;
import com.codepride.salesmicro.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    private userRepository userRepository;
      @PostMapping("/user")
      user newUser(@RequestBody user newUser){
          return userRepository.save(newUser);
      }


}
