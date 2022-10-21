/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.exceptions.MiException;
import com.egg.biblioteca.servicios.AutorServicios;
import com.egg.biblioteca.servicios.EditorialServicios;
import com.egg.biblioteca.servicios.LibroServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String registrar(ModelMap modelo){
        List<Autor> autores = autorServicio.listaAutores();
        List<Editorial> editoriales = editorialServicio.listaEditoriales();
        
        // esto para que era?
        
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        
        
        return "libro_forms.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam(required=false) Long isbn, @RequestParam String titulo,
            @RequestParam(required=false) Integer ejemplares, @RequestParam String idAutor, 
            @RequestParam String ideditorial, ModelMap modelo){
        
        try {
            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, ideditorial); //si todo sale bioen retornamos al
            
            modelo.put("exito", "El libro fue cargado correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "libro_forms.html"; //volvemos a cargar el formulario
        }
        
        return "index.html";
    }
    
    
}
