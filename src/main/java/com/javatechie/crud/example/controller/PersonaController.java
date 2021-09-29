package com.javatechie.crud.example.controller;

import java.util.List;

import com.javatechie.crud.example.entity.Persona;
import com.javatechie.crud.example.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService service;

    /*@PostMapping("/addUsuario")
    public Persona addUsuario(@RequestBody Persona product) {
        return service.saveUsuario(product);
    }

    @PostMapping("/addUsuarios")
    public List<Persona> addUsuarios(@RequestBody List<Persona> products) {
        return service.saveUsuarios(products);
    }*/

    @GetMapping("/listPersona")
    public List<Persona> listPersona() {
        return service.listPersona();
    }

    /*@GetMapping("/usuarioById/{id}")
    public Persona findUsuarioById(@PathVariable int id) {
        return service.getUsuarioById(id);
    }

 
    @PostMapping("/updateUsuario")
    public Persona updateUsuario(@RequestBody Persona product) {
        return service.updateUsuario(product);
    }

    @PostMapping("/deleteUsuario/{id}")
    public String deleteUsuario(@PathVariable int id) {
        return service.deleteUsuario(id);
    }*/
}
