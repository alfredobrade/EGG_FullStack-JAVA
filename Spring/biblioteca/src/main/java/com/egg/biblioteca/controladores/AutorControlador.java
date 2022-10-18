/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.servicios.AutorServicios;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor") // localhost:8080/autor
public class AutorControlador {
    
    @Autowired
    private AutorServicios autorServicio;
    
    @GetMapping("/registrar") //localhost:8080/autor/registrar
    public String registrar(){
        
        return "autor_forms.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre) {
        
        try {
            autorServicio.crarAutor(nombre);
        } catch (Exception ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            return "autor_forms.html";
        }
        
        return "index.html";
    }
    
}
