package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

}
