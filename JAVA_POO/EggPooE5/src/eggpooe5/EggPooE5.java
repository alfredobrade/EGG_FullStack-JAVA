
package eggpooe5;

import eggpooe5.entidades.Cuenta;
import java.util.Scanner;


public class EggPooE5 {

    
    public static void main(String[] args) {
        /*en este caso el ingreso de valores a los atributos del objeto es simple
        porque se declararon como public
        */
        
        // aca va el crador de objetos
        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese N° de Cliente , DNI , Saldo, Interés");
        Cuenta cuenta1 = new Cuenta(ingreso.nextInt(), ingreso.nextLong(), ingreso.nextInt(), ingreso.nextInt());
        
        System.out.println("que desea hacer?\n1.Deposito\n2.extraccion\n3.Ext Rapida\n4.Saldo\n5.Datos cuenta\n6.salir");
        int opcion = ingreso.nextInt();
        
        while (opcion != 6) {
               
            switch (opcion){
                case 1: 
                    // metodo de ingreso de dinero
                    System.out.println("ingrese un deposito");
                    double deposito = ingreso.nextDouble();
                    cuenta1.ingresar(deposito);
                    System.out.println("usted depositó $" + deposito);
                    cuenta1.consultarSaldo();
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    
                break;
                case 2: 
                    //metodo para retiro de dinero
                    System.out.println("cuanto desea retirar");
                    double extraccion = ingreso.nextDouble();
                    cuenta1.retirar(extraccion);
                    System.out.println("usted retiró $" + extraccion);
                    cuenta1.consultarSaldo();
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                break;
                case 3:
                    //metodo de extraccion rapida
                    System.out.println("cuanto desea retirar?");
                    double extRap = ingreso.nextDouble();
                    cuenta1.extraccionRapida(extRap);
                    
                    // no va aca la impresion.. tiene que ir en el metodo
                    // porque en el metodo esta el if que dice si se puede retirar o no
                    System.out.println("usted retiró $" + extRap);
                    cuenta1.consultarSaldo();
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                break;
                case 4:
                    //metodo para consultar saldo
                    cuenta1.consultarSaldo();
                    break;
                case 5:
                    // impresion de todos los datos
                    //System.out.println(cuenta1.toString());
                    cuenta1.consultarDatos();
                break;
                default: System.out.println("no es una opcion valida, intente nuevamente");

            }
            
            System.out.println("que desea hacer?\n1.Deposito\n2.extraccion\n3.Ext Rapida\n4.Saldo\n5.Datos cuenta\n6.salir");
            opcion = ingreso.nextInt();                   
            
        }
        
        System.out.println("que tenga un buen dia!");
    }   
}
