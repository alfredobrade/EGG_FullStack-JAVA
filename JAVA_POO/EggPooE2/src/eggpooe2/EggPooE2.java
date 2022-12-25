/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe2;

import eggpooe2.entidades.Circunferencia;
import eggpooe2.servicios.ServiciosCircunferencia;

/**
 *
 * @author USUARIO
 */
public class EggPooE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosCircunferencia sc = new ServiciosCircunferencia();
        Circunferencia c1 = sc.crearCincunferencia();
        double area = sc.area(c1);
        double perimetro = sc.perimetro(c1);
        
        System.out.println("radio de la circunferencia es " + c1.getRadio() + "cm");
        System.out.println("el area de la circunferencia es " + area + "cm");
        System.out.println("el perimetro de la circunferencia es " + perimetro + " cm");
        
        
    }
    
}
