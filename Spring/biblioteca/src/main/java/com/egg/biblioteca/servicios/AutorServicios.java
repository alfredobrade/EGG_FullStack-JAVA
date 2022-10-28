 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.exceptions.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//
@Service
public class AutorServicios {
    
    @Autowired
    AutorRepositorio autorRepositorio;
    
    @Transactional
    public void crarAutor(String nombre)throws MiException, Exception{
        
        validar(nombre);
        
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        
        autorRepositorio.save(autor);
        
    }
    
    public List<Autor> listaAutores(){
        
        
        
        List<Autor> autores = new ArrayList();
        
        autores = autorRepositorio.findAll();
        
        return autores;
    }
    
    @Transactional
    public void modificarAutor(String nombre, String id) throws Exception{
        
        validar(nombre);
        
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        
        if (respuesta.isPresent()){
            Autor autor = respuesta.get();
            
            autor.setNombre(nombre);
            
            autorRepositorio.save(autor);
        }
    }
    
    //porque pone 2 excepciones si una ya esta dentro de la otra -- me dice que sino le meta un "try n catch"
    private void validar(String nombre) throws MiException, Exception{
        
        if (nombre.isEmpty() || nombre == null) {
            throw MiException("el nombre no puede estar vacio");
            
        }
        
    }
    
    //no se porque aparece asi la exception
    private Exception MiException(String el_nombre_no_puede_estar_vacio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
