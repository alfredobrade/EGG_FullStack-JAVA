/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe4.entidades;

/**
 *
 * @author USUARIO
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int getAltura(){
        return altura;
    }
}
