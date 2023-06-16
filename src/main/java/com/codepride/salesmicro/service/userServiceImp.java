package com.codepride.salesmicro.service;

import com.codepride.salesmicro.model.user;
import com.codepride.salesmicro.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImp implements userService {
    @Autowired
    private userRepository userRepository;
    @Override
    public user saveUser(user user) {
        return userRepository.save(user);
    }
}
