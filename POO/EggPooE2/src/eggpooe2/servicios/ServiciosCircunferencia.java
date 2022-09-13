/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe2.servicios;

import eggpooe2.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ServiciosCircunferencia {
    
    Scanner ingreso = new Scanner(System.in);
    
    public Circunferencia crearCincunferencia(){
        System.out.println("ingrese el radio");
        double radio = ingreso.nextDouble();
        
        
        Circunferencia c = new Circunferencia(radio);
        return c;
    }
    
    public double area(Circunferencia c) {
        double radio = c.getRadio();
        double area = 3.141516 * Math.pow(radio, 2); 
        return area;
    }
        public double perimetro(Circunferencia c){
            double radio = c.getRadio();
            double perimetro = 2 * Math.PI * radio;
            return perimetro;
        }
    
}
