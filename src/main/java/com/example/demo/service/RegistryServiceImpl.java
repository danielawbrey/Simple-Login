package com.example.demo.service;

import com.example.demo.User;
import com.example.demo.dao.RegistryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class RegistryServiceImpl implements RegistryService {

    @Autowired
    RegistryDAO registryDAO;

    @Override
    public boolean register(String username, String password, String firstname,
                            String lastname, String email) {
        return registryDAO.register(username, password, firstname, lastname, email);
    }

    @Override
    public boolean verify(String username, String password) {
        return registryDAO.verify(username, password);
    }
}
