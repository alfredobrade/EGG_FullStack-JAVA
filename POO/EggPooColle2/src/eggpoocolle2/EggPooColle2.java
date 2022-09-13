/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpoocolle2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EggPooColle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> listaRazas = new ArrayList<>();
        //Perro perro = new Perro();
                
        Scanner ingTec = new Scanner(System.in);
        
        System.out.println("- desea ingresar un perro? S/N - ");
        String bandera = ingTec.next();
        while (!bandera.equalsIgnoreCase("n")){
       
            if((!bandera.equalsIgnoreCase("n"))&&(!bandera.equalsIgnoreCase("s"))){
                System.out.println("--ingreso un valor incorrecto--");
            }else {
                System.out.println("-ingrese raza-");
                
                listaRazas.add(new Perro(ingTec.next()));
            }
            
            
            System.out.println("----------------------------"
                    + "\n- desea ingresar un perro? S/N - ");
            bandera = ingTec.next();
        }
        System.out.println("----------------");
        for (Perro var : listaRazas) {
            System.out.println(var.getRaza());
        }
        
        System.out.println("- desea ELIMINAR un perro? S/N - ");
        bandera = ingTec.next();
        while (!bandera.equalsIgnoreCase("n")){
       
            if((!bandera.equalsIgnoreCase("n"))&&(!bandera.equalsIgnoreCase("s"))){
                System.out.println("--ingreso un valor incorrecto--");
            }else {
                System.out.println("-ingrese raza-");
                Perro perro = new Perro(ingTec.next());
                
                //no se eliminan elementos con un forEach
//                for (Perro var : listaRazas) {
//                    if(var.getRaza().equals(perro.getRaza())){
//                        listaRazas.remove(var);
//                    }
//                }

                //hay que eliminarlos con un forI
                for (int i = 0; i < listaRazas.size(); i++) {
                    if(listaRazas.get(i).getRaza().equals(perro.getRaza())){
                        listaRazas.remove(i);
                    }
                }
                
            }
            
            
            System.out.println("----------------------------"
                    + "\n- desea ELIMINAR un perro? S/N - ");
            bandera = ingTec.next();
        }
        
        
        System.out.println("----------------");
        for (Perro var : listaRazas) {
            System.out.println(var.getRaza());
        }
        System.out.println("-----saliendo-----");
        
        
        
    }
    
}
