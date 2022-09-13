/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe4;

import eggpooe4.entidades.Rectangulo;
import eggpooe4.metodos.RectanguloMetodos;

/**
 *
 * @author USUARIO
 */
public class EggPooE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloMetodos rm = new RectanguloMetodos();
        Rectangulo rec1 = rm.crearRectangulo();
        
        System.out.println("la superficie es "+ rm.calcularSuperficie(rec1));
        System.out.println("el perimetro es "+ rm.calcularPerimetro(rec1));
        rm.dibujarCuadradito(rec1);
        
    }
    
}
