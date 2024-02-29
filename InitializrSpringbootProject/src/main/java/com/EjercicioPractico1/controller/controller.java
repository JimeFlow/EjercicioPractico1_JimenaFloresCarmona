package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.service.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j

public class controller {
    
    @Autowired
    private service service;
    
    @GetMapping("/libros")
    public String listarLibros(Model model) {
        try {
            var libros = service.getlibros(false);
            model.addAttribute("libros", libros);
            model.addAttribute("totallibros", libros.size());
        } catch (Exception e) {
            log.error("Error al obtener la lista de libros", e);
            model.addAttribute("error", "Se produjo un error al obtener la lista de libros.");
        }
        return "libro/listado";
    }
}
