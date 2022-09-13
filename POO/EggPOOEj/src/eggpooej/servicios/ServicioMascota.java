/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooej.servicios;

import eggpooej.entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import eggpooej.utilidades.Comparadores;
import java.util.Collections;

/**
 *
 * @author USUARIO
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private List<Mascota> mascotas;
    
    public ServicioMascota(){
        
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota() {
        System.out.println("introducir nombre");
        String nombre = leer.next();
        System.out.println("introducir apodo");
        String apodo = leer.next();
        System.out.println("introducir tipo");
        String tipo = leer.next();
        
        
        /*
        tambien se puede devolver el valor que entrega el constructor
        sin crear una variable m
        */
        
        return new Mascota(nombre, apodo, tipo);
        
        
    }
    public void mostrarMascotas(){
        System.out.println("las mascotas actuales de la lista son:");
        System.out.println("--------------------------------------");
        //bucle por each
        // tipo de variable, variable aux, : collection a recorrer
        for (Mascota var : mascotas) {
            System.out.println("-"+var.toString());
        }
        System.out.println("--------------------------------------");
        System.out.println("cantidad "+mascotas.size());
    }
    //se ingresa cantidad de objetos a crear. guarda objetos en "mascotas"
    public void fabricaMascotas(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(crearMascota());
        }
    }
    
    // modifica segun indice
    // TODO añadir Try and Catch 
    public void actualizarMascota(int index){
        //agregar condiciones del indice
        mascotas.get(index).setApodo("nuevo apodo");
    }
    
    public void eliminarMascota(int index){
        //agregar condiciones del indice
        
        mascotas.remove(index);
        
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equals(nombre)){
                mascotas.remove(i);
            }
        }
    }
    
    
}
