package com.example.lab3_20191802.entity;


import com.sun.jdi.event.StepEvent;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "equipamiento")
public class Equipamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idequipamiento", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;
}
