package com.example.demo.controller.registry;

import com.example.demo.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class RegistryController {

    @Autowired
    RegistryService registryService;

    @GetMapping
    public String home() { return "user-registry.html"; }

    @PostMapping("/user/{username}/{password}/{firstname}/{lastname}/{email}")
    public boolean register(@PathVariable String username, @PathVariable String password,
                            @PathVariable String firstname, @PathVariable String lastname,
                            @PathVariable String email) {
        return registryService.register(username, password, firstname, lastname, email);
    }
}
