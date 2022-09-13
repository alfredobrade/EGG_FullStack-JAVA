/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe1.servicios;

import eggpooe1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class LibroServicios {
    Scanner ingresar = new Scanner(System.in).useDelimiter("\n");
    public Libro crearLibro(){
        System.out.println("ingresar ISBN");
        String isbn = ingresar.next();
        System.out.println("ingresar titulo");
        String titulo = ingresar.next();
        System.out.println("ingresar Autor");
        String autor = ingresar.next();
        System.out.println("ingresar numero de Páginas");
        String numPaginas = ingresar.next();
        
        Libro l = new Libro(isbn, titulo, autor, numPaginas);
        
        return l; 
    }
}
