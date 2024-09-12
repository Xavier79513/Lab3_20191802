package com.example.lab3_20191802.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ingrediente")
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idingrediente",nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;
}
