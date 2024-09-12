package com.example.lab3_20191802.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "receta_equipamiento")
public class Receta_Equipamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceta_equipamiento", nullable = false)
    private Integer id;

    @ManyToOne
    private Receta receta;

    @ManyToOne
    private Equipamiento equipamiento;
}
