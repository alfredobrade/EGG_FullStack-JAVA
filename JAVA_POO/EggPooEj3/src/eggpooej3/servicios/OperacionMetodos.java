/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooej3.servicios;

import eggpooej3.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class OperacionMetodos {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        System.out.println("ingrese primer numero");
        double num1 = leer.nextDouble();
        System.out.println("ingrese segundo numero");
        double num2 = leer.nextDouble();
        
        Operacion o = new Operacion();
        o.setNumero1(num1);
        o.setNumero2(num2);
        return o;
    }
    
    public double sumar(Operacion o){
        
        double a = o.getNumero1();
        double b = o.getNuemro2();
        double c = a + b;
        return c;
    }
    
    public double restar(Operacion o){
        
        double a = o.getNumero1();
        double b = o.getNuemro2();
        double c = a - b;
        return c;
    }
    public double multiplicar(Operacion o){
        
        double a = o.getNumero1();
        double b = o.getNuemro2();
        double c = 0;
        if (a != 0 && b != 0){
            c = a * b;
        }else {
            System.out.println("multiplicacion por 0 es nula");
            
        }
        
        return c;
    }
    public double dividir(Operacion o){
        
        double a = o.getNumero1();
        double b = o.getNuemro2();
        double c = 0;
        if (b != 0){
            c = a / b;
        } else {
            System.out.println("no se puede dividir por 0");
        }
       
        return c;
    }
    
}
