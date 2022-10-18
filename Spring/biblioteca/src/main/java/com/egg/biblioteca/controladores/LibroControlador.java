/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.exceptions.MiException;
import com.egg.biblioteca.servicios.AutorServicios;
import com.egg.biblioteca.servicios.EditorialServicios;
import com.egg.biblioteca.servicios.LibroServicios;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/libro")
public class LibroControlador {
    
    @Autowired
    private LibroServicios libroServicio;
    @Autowired
    private AutorServicios autorServicio;
    @Autowired
    private EditorialServicios editorialServicio;
    
    @GetMapping("/registrar") // localhost:8080/libro/registrar
    public String registrar(){
        
        return "libro_forms.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam Long isbn, @RequestParam String titulo, @RequestParam Integer ejemplares, @RequestParam String idAutor, @RequestParam String ideditorial){
        
        try {
            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, ideditorial); //si todo sale bioen retornamos al
        } catch (MiException ex) {
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, ex);
            return "libro_forms.html"; //volvemos a cargar el formulario
        }
        
        return "";
    }
    
    
}
