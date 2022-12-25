/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author alfre
 */
public class JavaIntro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primero declaramos  dos variables de tipo entero
        int a,b;
        //creamos un Scanner del paquete java.util
        Scanner leer = new Scanner(System.in);
        //pedimos por teclado ambos valores
        System.out.println("Ingrese primer numero");
        a = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        b = leer.nextInt();
        //imprimimos la suma
        System.out.println("La suma es = "+ (a+b));
        
    }
    
}
