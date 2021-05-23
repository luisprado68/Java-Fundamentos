/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author CE39207770
 */
public class PasoPorReferencia {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Luis";
        System.out.println("nombre = " + persona1.nombre);
        
        cambiarValor(persona1);
        System.out.println("nombre cambiado = " + persona1.nombre);
        
        Persona personaDos = new Persona();
        personaDos.nombre = "Maria";
        System.out.println("nombre = " + personaDos.nombre);
        personaDos = cambiarValorPersona(personaDos);
        System.out.println("nombre cambiado con return = " + personaDos.nombre);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "Juan";
    }
    
    public static Persona cambiarValorPersona(Persona persona){
        persona.nombre = "Lucia";
        return persona;
    }
}
