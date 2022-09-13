/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe1.entidades;



/**
 *
 * @author USUARIO
 */
public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public String numPaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    
    
}
