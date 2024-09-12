package com.example.lab3_20191802.repository;

import com.example.lab3_20191802.entity.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente,Integer> {

}
