package com.example.lab3_20191802.entity;


import jakarta.persistence.*;
import com.example.lab3_20191802.entity.Categoria;
import jakarta.websocket.Encoder;
import lombok.Getter;
import lombok.Setter;
import org.attoparser.dom.Text;

import java.sql.Time;

@Setter
@Getter
@Entity
@Table(name = "receta")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceta", nullable = false)
    private Integer id;

    @ManyToOne
    private Categoria categoria;

    @Column(name = "nombre", length = 200)
    private String idcategoria;

    @Column(name = "instrucciones")
    private Text instrucciones;

    @Column(name = "dificultad")
    private Integer dificultad;

    @Column(name = "tiempo_preparacion")
    private Time tiempopreparacion;

}
