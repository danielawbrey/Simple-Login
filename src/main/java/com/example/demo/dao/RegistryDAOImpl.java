package com.example.demo.dao;

import com.example.demo.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository("RegistryDAO")
public class RegistryDAOImpl implements RegistryDAO {

    @Override
    public User register(@RequestBody User user) {
        return new User();
    }
}
