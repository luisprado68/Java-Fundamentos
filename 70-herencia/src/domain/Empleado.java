/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author CE39207770
 */
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
       this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado( double sueldo, String nombre ){
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public Empleado(String nombre, char genero, int edad, String direccion,double sueldo){
        this(sueldo,nombre);
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Empleado idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
