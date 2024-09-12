package com.example.lab3_20191802.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.attoparser.dom.Text;

@Setter
@Getter
@Entity
@Table(name = "nutricion")
public class Nutricion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnutricion", nullable = false)
    private Integer id;

    @ManyToOne
    private Receta receta;

    @Column(name = "calorias")
    private Double calorias;

    @Column(name = "grasas")
    private Double grasas;

    @Column(name = "proteínas")
    private Double proteinas;

    @Column(name = "carbohidratos")
    private Double carbohidratos;

    @Column(name = "fibra")
    private Double fibra;
}
