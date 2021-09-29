package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}

