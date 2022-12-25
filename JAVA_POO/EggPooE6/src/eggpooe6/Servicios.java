
package eggpooe6;

import java.util.Scanner;


public class Servicios {

    public Servicios() {
    }
    
    Scanner ingresoTeclado = new Scanner(System.in);

    // este menu puede crearse en otra clase y llamar al metodo
    // desplegarMenu() que podria retornar la opcion a seguir
    // esto para seguir con la metodologia de AEDI
    public int desplegarMenu(){
        //int valor = 0;
        System.out.println("Que deséa hacer?");
        System.out.println("\t1.llenar cafetera\n\t2.servir taza\n"
                + "\t3.vaciar cafetera\n\t4.agregar cafe\n5.salir");
        int valor = ingresoTeclado.nextInt();
         
        
        return valor;
    }
}
