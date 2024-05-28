package com.example.demo_Grup10.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_Grup10.models.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
    
}
