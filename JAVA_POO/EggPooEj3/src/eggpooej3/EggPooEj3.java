/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooej3;

import eggpooej3.entidades.Operacion;
import eggpooej3.servicios.OperacionMetodos;

/**
 *
 * @author USUARIO
 */
public class EggPooEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionMetodos om = new OperacionMetodos();
        
        Operacion op1 = om.crearOperacion();
        
        System.out.println(op1.toString());
        
        System.out.println("la suma es = " + om.sumar(op1));
        System.out.println("la resta es = "+ om.restar(op1));
        System.out.println("la multiplicacion es "+ om.multiplicar(op1));
        System.out.println("la division es "+ om.dividir(op1));
        
    }
    
}
