
package com.gm.mundopc;


public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private  int contadorCompu;
    private static int contadorOrden;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if( this.contadorCompu < Orden.MAX_COMPUTADORAS){
            
            this.computadoras[this.contadorCompu] = computadora;
            this.contadorCompu++;
        }
        else{
            System.out.println("Supero el maximo de computadoras");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden = "+ this.idOrden);
        System.out.println("Computadoras :");
        for (int i = 0; i < this.contadorCompu; i++) {
            System.out.println(this.computadoras[i]+"\n");
        }
    }

   
    
}
