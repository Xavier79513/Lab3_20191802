package com.example.lab3_20191802.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "receta_ingrediente")
public class Receta_Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_receta_ingrediente",nullable = false)
    private Integer id;

    @ManyToOne
    private Receta receta;

    @ManyToOne
    private Ingrediente ingrediente;

    @ManyToOne
    private Unidad_Medida unidadMedida;

    @Column(name = "cantidad")
    private Double cantidad;
}
