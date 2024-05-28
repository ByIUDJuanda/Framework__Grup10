package com.example.demo_Grup10.interfaceServicios;

import java.util.List;
import java.util.Optional;

import com.example.demo_Grup10.models.Persona; 

public interface IPersonaServicio {

    public List<Persona> listar();

    public Optional<Persona> editar(int id);

    public int guardar(Persona persona);

    public void eliminar(int id);
}
