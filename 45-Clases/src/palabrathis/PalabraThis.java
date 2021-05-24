/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author CE39207770
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona personaUno = new Persona("Luis","Prado");
        System.out.println("Nombre = " + personaUno.nombre);
        System.out.println("Apellido = " + personaUno.apellido);
        
        
    }
}
// si creamos un clase dentro de otra no se agrega el acceso public
//estas clases van a estar definidas dentro de este paquete
class Persona{
    
    String nombre;
    String apellido;
    
    Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona this:"+ this);
        //Imprimir imprimir = new Imprimir() 
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("impresion de objeto this" + this);
    }
}