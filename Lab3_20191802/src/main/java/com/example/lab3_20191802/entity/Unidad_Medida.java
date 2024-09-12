package com.example.lab3_20191802.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "unidad_medida")
public class Unidad_Medida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idunidad_medida",nullable = false)
    private Integer id;

    @Column(name = "nombre_unidad", length = 45)
    private String nombre;

    @Column(name = "simbolo", length = 10)
    private String simbolo;
}
