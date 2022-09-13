/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe4.metodos;

import eggpooe4.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class RectanguloMetodos {
    
    Scanner ingreso = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("ingrese la base ");
        int base = ingreso.nextInt();
        System.out.println("ingrese la altura ");
        int altura = ingreso.nextInt();
        
        Rectangulo rec = new Rectangulo(base, altura);
        
        return rec;
    }
    
    public int calcularSuperficie(Rectangulo rec){
        int base = rec.getBase();
        int altura = rec.getAltura();
        int superficie = base * altura;
        
        return superficie;
    }
    
    public int calcularPerimetro(Rectangulo rec){
        int base = rec.getBase();
        int altura = rec.getAltura();
        int perimetro = (base + altura) * 2;
        
        return perimetro;
    }
    
    public void dibujarCuadradito(Rectangulo rec){
        int base = rec.getBase();
        int altura = rec.getAltura();
        
        for (int i = 0; i < base; i++){
            if (i == 0 || i == (base-1)) {
                for (int j = 0; j < altura; j++){
                    System.out.print("*");
                    //j = j+1;
                }
                
            }else {
                for (int j = 0; j < altura; j++){
                    if (j == 0 || j == (altura-1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                    //j = j+1;
                    
                }
            
            }
            //j = 0;
            //i = i + 1;
            System.out.println("");
        }
    }    
}
