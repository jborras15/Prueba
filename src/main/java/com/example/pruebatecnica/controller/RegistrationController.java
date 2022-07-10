package com.example.pruebatecnica.controller;


import com.example.pruebatecnica.entity.User;
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


    @ModelAttribute("user") 
    public User returnNwUser(){
        return new User();
    }

    @GetMapping
    public  String showRegistrationForm(){
        return  "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/registration?success";
    }
}
