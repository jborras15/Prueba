package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entity.Users;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    Users save(Users users);



}
