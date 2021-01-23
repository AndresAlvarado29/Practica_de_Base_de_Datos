/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Persona;
import java.util.Date;

/**
 *
 * @author Andres
 */
public class Principal {
public static  void main(String[]args){
    System.out.println("creanddo");
    Persona p=new Persona("1952436609", "Luz", "Esteban Morales y 27 de Febrero", new Date(), 3, 750.0);
    ControladorPersona controladorPersona =new ControladorPersona();
    controladorPersona.insertarPersona(p);
    System.out.println(p);
}
        
}
