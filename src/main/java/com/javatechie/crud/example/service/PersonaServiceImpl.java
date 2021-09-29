package com.javatechie.crud.example.service;

import java.util.List;

import com.javatechie.crud.example.entity.Persona;
import com.javatechie.crud.example.repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    private PersonaRepository repository;

 
    
    /*public Persona savePersona(Persona product) {
    	
    	if (product.getCod_usuario()==null) {
            
		}else {
			
			Persona existingProduct = repository.findById(product.getCod_usuario()).orElse(null);
		        existingProduct.setNombre(product.getNombre());
		        existingProduct.setUser(product.getUser());
		        existingProduct.setPassword(product.getPassword());
		        existingProduct.setCod_sucursal(product.getCod_sucursal());
		        
		        return repository.save(existingProduct);
		}
        return repository.save(product);
    }

    public List<Persona> saveUsuarios(List<Persona> products) {
        return repository.saveAll(products);
    }
 

    public Persona getUsuarioById(int id) {
        return repository.findById(id).orElse(null);
    }

 

    public String deleteUsuario(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Persona updateUsuario(Persona product) {
    	Persona existingProduct = repository.findById(product.getCod_usuario()).orElse(null);
        existingProduct.setNombre(product.getNombre());
        existingProduct.setUser(product.getUser());
        existingProduct.setPassword(product.getPassword());
        existingProduct.setCod_sucursal(product.getCod_sucursal());
        return repository.save(existingProduct);
    }*/


    @Override
    public List<Persona> listPersona() {
        return repository.findAll();
    }
 

}
