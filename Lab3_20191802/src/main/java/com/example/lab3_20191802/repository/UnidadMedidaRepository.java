package com.example.lab3_20191802.repository;

import com.example.lab3_20191802.entity.Unidad_Medida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnidadMedidaRepository extends JpaRepository<Unidad_Medida, Integer> {

}
