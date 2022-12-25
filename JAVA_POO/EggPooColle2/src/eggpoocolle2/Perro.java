/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggpoocolle2;

/**
 *
 * @author USUARIO
 */
public class Perro {
    //private int id;
    private String raza;

    public Perro() {
    }

    public Perro( String raza) {
        //this.id = id;
        this.raza = raza;
    }
    /*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    */
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
