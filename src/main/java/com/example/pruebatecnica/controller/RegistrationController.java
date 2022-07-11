package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Users;
import com.example.pruebatecnica.repository.UserRepository;
import com.example.pruebatecnica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;


    @ModelAttribute("users")
    public Users returnNwUser(){
        return new Users();
    }

    @GetMapping
    public  String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@Valid @ModelAttribute("user") Users users , RedirectAttributes redirectAttributes, BindingResult result) {
        Users existing = userRepository.findByEmail(users.getEmail());

        if (existing != null ) {
            redirectAttributes
                    .addFlashAttribute("mensaje", "El correo ya existe ")
                    .addFlashAttribute("clase", "danger");
            return "redirect:registration";
        }

        userService.save(users);
        return "redirect:/registration?success";
    }

}
