package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entity.Role;
import com.example.pruebatecnica.entity.User;
import com.example.pruebatecnica.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
        User usuario=new User(user.getFirstName(),
                user.getLastName(), user.getEmail(),
                 user.getPassword(),Arrays.asList(new Role("ROLE_USER")));

        return  userRepository.save(usuario);
    }





}
