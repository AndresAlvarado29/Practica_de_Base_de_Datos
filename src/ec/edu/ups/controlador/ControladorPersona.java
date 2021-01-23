/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class ControladorPersona {
    public boolean insertarPersona(Persona persona){
    Connection con = Controlador.conectar();
        try {
            String sql= "INSERT INTO PERSONA(CEDULA, NOMBRES, APELLIDO, DIRECCION, FECHA_NACIMIENTO,NUMERO_CARGA, SALARIO) VALUES('?', '?', '?','?', '?','?','?')";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, persona.getCedula());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDireccion());
            ps.setDate(4, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
            ps.setInt(5, persona.getNumeroCarga());
            ps.setDouble(6, persona.getSalario());
            ps.execute();
        } catch (Exception e) {
        }finally{
        Controlador.desconectar(con);
        }
        return true;
    }
    public List<Persona> consultarPersonas(){
     List<Persona> listado = new ArrayList();
     Connection con = Controlador.conectar();
        try {
            String sql = "SELECT * FROM PERSONA";
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet resultado =ps.executeQuery();
            while (resultado.next()) {
Persona p = new Persona();
p.setCedula(resultado.getString(1));
p.setCedula(resultado.getString(2));
                
            }
        } catch (Exception e) {
        }
     return listado;
    }
}
