/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class Controlador {

    public static Connection conectar(){
        Connection con=null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BaseDeDatosPractica", "postgres", "Andruco20012002");
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        return con;
    }
    public static void desconectar(Connection con){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
    
}
