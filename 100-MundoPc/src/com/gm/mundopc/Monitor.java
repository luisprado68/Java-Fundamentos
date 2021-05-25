
package com.gm.mundopc;


public class Monitor {
   private int idMonitor;
   private String marca;
   private double tamano;
   private static int contadorMonitores;
   
   public Monitor(){
       this.idMonitor = ++Monitor.contadorMonitores;
   }
   public Monitor(String marca,double tamano){
       this();
       this.marca = marca;
       this.tamano = tamano;
   }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{idMonitor=").append(this.idMonitor);
        sb.append("\n");
        sb.append(", marca=").append(this.marca);
        sb.append("\n");
        sb.append(", tamano=").append(this.tamano);
        sb.append('}');
        return sb.toString();
    }
    
    
}


