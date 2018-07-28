package com.example.demo.service;

import com.example.demo.User;
import com.example.demo.dao.RegistryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/register")
public class RegistryServiceImpl implements RegistryService {

    @Autowired
    RegistryDAO registryDAO;

    @PutMapping("/user")
    public User register(@RequestBody User user) { return registryDAO.register(user); }
}
