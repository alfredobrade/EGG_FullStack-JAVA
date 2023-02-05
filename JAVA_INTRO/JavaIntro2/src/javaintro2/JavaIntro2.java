/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla
 */
package javaintro2;

import java.util.Scanner;

/**
 *
 * @author alfre
 */
public class JavaIntro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Hola " + nombre + "!");
    }
    
}
