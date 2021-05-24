/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author CE39207770
 */
public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        
        
        Persona personaUno = new Persona("Luis Prado");
       
        Persona personaDos = new Persona("Laura Prado");
        
        PersonaPrueba.imprimir(personaUno);
        imprimir(personaDos);
        
    }
    public static void imprimir(Persona persona){
        System.out.println("Persona"+ persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
