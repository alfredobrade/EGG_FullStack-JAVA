/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooej;

import eggpooej.entidades.Mascota;
import eggpooej.servicios.ServicioMascota;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import eggpooej.utilidades.Comparadores;

/**
 *
 *
 */
public class EggPOOEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        /*
        Mascota m1 = new Mascota(leer.next(),leer.next(),leer.next());
        //m1.apodo = "chiquito";
        //m1.nombre = "fernando chiquito";
        //m1.tipo = "perro";
        //m1.edad = 12;
        //m1.raza = "truchito";
        //m1.color = "marron";
        //m1.cola = true;

        m1.setNombre("pititus");
        m1.pasear(100);
        m1.pasear(10, 5);
        System.out.println(m1.toString());
        System.out.println(m1.getNombre());
        */
        
        //instancio un objeto de tipo servicio mascota
        ServicioMascota sm = new ServicioMascota();
        
        //Mascota m1 = sm.crearMascota();

        
        //System.out.println(m1.toString());

        //public String nombre;
        //public String apodo;
        ////conejo, gato, perro, loro, carpincho
        //public String tipo;
        //public String color;
        //public int edad;
        //public boolean cola;
        //public String raza;
        
        
        // probando cosas de list
        String[] nombres = {"pepe","pepa"};
        List<String> nombresList = new ArrayList(Arrays.asList(nombres));
        
        List<String> nombresList2 = new ArrayList();
        nombresList2.addAll(0,nombresList);
                
        
        //aca haciendo lo que mostraba el vago
        
        System.out.println("cuantas crear?");
        int cant = leer.nextInt();
        sm.fabricaMascotas(cant);
        
        
        sm.mostrarMascotas();
        
//        sm.actualizarMascota(0);
//        sm.mostrarMascotas();
//        sm.eliminarMascota(1);
//        sm.mostrarMascotas();
        
        List<Mascota> masco = new ArrayList();
        masco.add(new Mascota("fer","chiquito","perro"));
        masco.add(new Mascota("pepa","lola","gato"));
        

//porque no puedo hacer el collections ese en la clase servicios?
        Collections.sort(masco , Comparadores.ordenarXNombreDesc);
        for (Mascota var : masco) {
            System.out.println(var);
        }
        
    }
    
}
