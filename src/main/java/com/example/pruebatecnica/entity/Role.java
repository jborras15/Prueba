package com.example.pruebatecnica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name;




}
