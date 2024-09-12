package com.example.lab3_20191802.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria",nullable = false)
    private Integer id;

    @Column(name = "categoria", length = 45)
    private String categoria;

}
