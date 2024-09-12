package com.example.lab3_20191802.repository;

import com.example.lab3_20191802.entity.Nutricion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NutricionRepository extends JpaRepository<Nutricion, Integer> {

}
