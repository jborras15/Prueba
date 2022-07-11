package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByEmail(String email);

}
