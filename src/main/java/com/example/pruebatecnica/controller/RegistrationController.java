package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Users;
import com.example.pruebatecnica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    private UserService userService;


    @ModelAttribute("users")
    public Users returnNwUser(){
        return new Users();
    }

    @GetMapping
    public  String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") Users users) {
        userService.save(users);
        return "redirect:/registration?success";
    }

}
