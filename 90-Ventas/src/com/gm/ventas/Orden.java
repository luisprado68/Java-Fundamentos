/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.ventas;


public class Orden {
    private int idOrden;
    private Producto productos [];
    private static int contadorOrden;
    private int contadorProducto;
    private static final int MAX_PRODUCTOS =10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    public void agregarProducto(Producto producto){
       
      if(this.contadorProducto < Orden.MAX_PRODUCTOS ){
          
          this.productos[this.contadorProducto]= producto;
          this.contadorProducto++;
      }
      else{
          System.out.println("Se supero el maximo de productos");
      }
    }
    public double calcularTotal(){
        double resultado=0;
        for (int i = 0; i < this.contadorProducto ; i++) {
            
            resultado += this.productos[i].getPrecio();
        }
        return resultado;
    }
    
    public void mostrarOrden(){
        System.out.println( "idOrden=" + this.idOrden +"\nProductos: ");
        for (int i = 0; i < this.contadorProducto; i++) {
            System.out.println(this.productos[i]+"\n");
        }
        System.out.println("Total de precio"+ this.calcularTotal());
    }

    
    
}
