
package eggpooe6;

import java.util.Scanner;


public class EggPooE6 {

   
    public static void main(String[] args) {
        // creando el scanner
        Scanner ingresoTeclado = new Scanner(System.in);
        //creando los objetos para trabajar
        Servicios servicio = new Servicios();
        Cafetera cafetera = new Cafetera();
        // para iniciar ingresamos el tamaño de la cafetera
        System.out.println("ingrese capacidad de la cafetera");
        int capacidad = ingresoTeclado.nextInt();
        cafetera.setCapacidadMaxima(capacidad);
        //trabajamos conun menu de opciones        
        int opcion = 0;
        while (opcion != 5){
            opcion = servicio.desplegarMenu();
            switch(opcion){
            case 1: 
                cafetera.llenarCafetera();
            break;
            case 2:
                System.out.println("ingrese tamño taza");
                int tamaño = ingresoTeclado.nextInt();
                cafetera.servirTaza(tamaño);
                break;
            case 3:
                cafetera.vaciarCafetera();
                break;
            case 4:
                System.out.println("cuanto cafe desea agregar?");
                int cantidad = ingresoTeclado.nextInt();
                cafetera.agregarCafe(cantidad);
                break;
            case 5:
                break;
            default: System.out.println("ingreso un numero incorrecto");
        }
        
            
        }
        
    }
    
}
