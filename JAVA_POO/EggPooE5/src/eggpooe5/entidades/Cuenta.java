/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpooe5.entidades;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Cuenta {
    public int numeroCliente;
    public long dniCliente;
    public int saldo;
    public int interés;
    
    public Cuenta(){
        
    }

    public Cuenta(int numeroCliente, long dniCliente, int saldo, int interés) {
        this.numeroCliente = numeroCliente;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
        this.interés = interés;
    }
    
    public void setNumeroCliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }
    
    public int getNumeroCliente(){
        return numeroCliente;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInterés() {
        return interés;
    }

    public void setInterés(int interés) {
        this.interés = interés;
    }
    
    // no se pone un creador dentro de la clase
    /*
    public Cuenta crearCuenta(){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese N° de Cliente , DNI , Saldo, Interés");
        Cuenta cuenta = new Cuenta(ingreso.nextInt(), ingreso.nextLong(), ingreso.nextInt(), ingreso.nextInt());
        return cuenta;
        
    }
    */
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCliente=" + numeroCliente + ", dniCliente=" + dniCliente + ", saldo=" + saldo + ", inter\u00e9s=" + interés + '}';
    }

    public int ingresar(double deposito){
        saldo = saldo + (int)deposito;

        return saldo;
    }

    public int retirar(double retiro){
        if (this.saldo >= retiro){
            this.saldo = this.saldo - (int)retiro;
        }else {
            //aca dice que ponga el saldo en 0 pero no hago asi
            System.out.println("no tiene suficiente dinero en cuenta");
            System.out.println("su saldo es $" + this.saldo);
        }
            
        return saldo;
    }
    
    /* en este metodo me pide que sea sin paramentros pero no
    se me ocurre como hacer
    */
    public int extraccionRapida(double retiro){
        if (retiro <= (double)(saldo * 0.2)){
            saldo = saldo - (int)retiro;
            
        }else { 
            System.out.println("no correspone a una extraccion rapida");
        }
                
        return saldo;
    }
    
    public void consultarSaldo(){
        System.out.println("el saldo disponible es $" + this.saldo);
    }
    
    public void consultarDatos(){
        System.out.println(toString());
    }
    
}
