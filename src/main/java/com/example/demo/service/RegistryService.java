package com.example.demo.service;

public interface RegistryService {
    boolean register(String username, String password,
                     String firstname, String lastname, String email);

    boolean verify(String username, String password);
}
