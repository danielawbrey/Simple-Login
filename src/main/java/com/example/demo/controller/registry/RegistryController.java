package com.example.demo.controller.registry;

import com.example.demo.User;
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

    @PostMapping("/user")
    @ResponseBody
    public User register(@RequestBody User user) { return registryService.register(user); }
}
