package com.example.pruebatecnica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {
    

    
    @GetMapping("/")
    public String inicio(Model model){
        return "index";
    }
    

}
