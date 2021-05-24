
package domain;

import java.util.Date;


public class Cliente extends Persona{
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente; 
    
    public Cliente(){
        this.idCliente = ++Cliente.contadorCliente;
    }

    public Cliente( Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        this();
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

  

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }
    
    
}
