/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajdbc1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class ArticulosDAO {
    String baseDeDatos = "pruebajdbc1";
    String usuario = "root";
    String password = "pancho";
    String host = "localhost";
    String puerto = "3306";
    String driver = "com.mysql.jdbc.Driver";
    String conexionUrl = "jdbc:mysql://"+host+":"+puerto+"/"+baseDeDatos;//"?useSSL=false";
    
    Connection conexion = null;
    
    
    
    /*
    try {
        Class.forName(driver);
        conexion = DriverManager.getConnection(conexionUrl, usuario, password);
    } catch (Exception ex) {
        Logger.getLogger(ArticulosDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    */
    
    
    
    
    
    
}
