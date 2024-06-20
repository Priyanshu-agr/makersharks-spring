package com.example.Sharks.Api.service;

import com.example.Sharks.Api.entity.User;
import com.example.Sharks.Api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public User findByUsername(String userName) {
        return userRepository.findByUserName(userName);
    }
}
