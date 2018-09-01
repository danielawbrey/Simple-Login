package com.example.demo.dao;

public interface RegistryDAO {
    boolean register(String username, String password,
                     String firstname, String lastname, String email);

    boolean verify(String username, String password);
}
