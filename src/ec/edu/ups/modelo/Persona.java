/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Andres
 */
public class Persona {
  private String cedula;
private String nombre;
private String Direccion;
private Date Fecha_nacimiento;
private int numeroCarga;
private Double salario;

public Persona(){
this.cedula="";
this.nombre="";
this.Direccion="";
this.Fecha_nacimiento=new Date();
this.numeroCarga=0;
this.salario=0.0;
}
    public Persona(String cedula, String nombre, String Direccion, Date Fecha_nacimiento, int numeroCarga, Double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.numeroCarga = numeroCarga;
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public int getNumeroCarga() {
        return numeroCarga;
    }

    public void setNumeroCarga(int numeroCarga) {
        this.numeroCarga = numeroCarga;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.numeroCarga != other.numeroCarga) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.Direccion, other.Direccion)) {
            return false;
        }
        if (!Objects.equals(this.Fecha_nacimiento, other.Fecha_nacimiento)) {
            return false;
        }
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", Direccion=" + Direccion + ", Fecha_nacimiento=" + Fecha_nacimiento + ", numeroCarga=" + numeroCarga + ", salario=" + salario + '}';
    }


}
