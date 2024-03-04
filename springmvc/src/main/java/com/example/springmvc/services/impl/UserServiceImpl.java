package com.example.springmvc.services.impl;

import com.example.springmvc.daos.UserRepository;
import com.example.springmvc.model.User;
import com.example.springmvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userdao;

    @Override
    public User saveUser(User user) {
        return userdao.save(user);
    }
}
