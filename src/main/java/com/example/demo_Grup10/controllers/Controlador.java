package com.example.demo_Grup10.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo_Grup10.interfaceServicios.IPersonaServicio;
import com.example.demo_Grup10.models.Persona;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IPersonaServicio servicio;

    @GetMapping("/")
    public String listar(Model model) {
        List<Persona> persona = servicio.listar();
        model.addAttribute("persona", persona);
        return "home";
    } 

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/save")
    public String guardar(@Validated Persona persona, Model model) {
        servicio.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Persona> persona = servicio.editar(id);
        model.addAttribute("persona", persona);
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(Model model, @PathVariable int id) {
        servicio.eliminar(id);
        return "redirect:/show";
    }
}
