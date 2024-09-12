package com.example.lab3_20191802.Controller;


import com.example.lab3_20191802.repository.RecetaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/Receta")
public class Controller1 {
    final RecetaRepository recetaRepository;

    public Controller1(RecetaRepository recetaRepository){
        this.recetaRepository = recetaRepository;
    }
}
