package com.example.demo_Grup10.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_Grup10.interfaceServicios.IPersonaServicio;
import com.example.demo_Grup10.interfaces.IPersona;
import com.example.demo_Grup10.models.Persona;

@Service
public class PersonaService implements IPersonaServicio {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> editar(int id) {
        return data.findById(id);
    }

    @Override
    public int guardar(Persona persona) {
        int res = 0;
        Persona persona2 = data.save(persona);

        if (!persona2.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
    
}