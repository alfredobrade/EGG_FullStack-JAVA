/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooej.entidades;

/**
 *
 * @author USUARIO
 */
public class Mascota {
    private String nombre;
    private String apodo;
    //conejo, gato, perro, loro, carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    private int energia;
    
    public Mascota() {
        //inicializando una variable en el constructor
        energia = 1000;
        //tambien se puede hacer directamente en el atributo
        // esto espara que cada objeto creado cuente con ese valor de atributo
    }
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        // se puede poner lógica dentro de los contructores
        //por ejemplo se puede poner un if
        this.energia = 1000;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        //tambien se puede poner lógica dentro de los setters y getters 
    }
    public String getNombre(){
        return nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    public int pasear(int energiaRestar) {
        //energia = energia - energiaRestar;
        energia -= energiaRestar;
        
        return energia;       
    }
    public int pasear(int energiaRestar, int vueltas){
        for (int i = 0 ; i < vueltas; i++){
            energia -= energiaRestar;
        }
        
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

   
    
}
