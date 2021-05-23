/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author CE39207770
 */
public class PruebaPersona {
    //psvm
    public static void main(String[] args) {
        
        Persona personaUno = new Persona();
        personaUno.nombre = "Luis";
        personaUno.apellido = "Prado";
        personaUno.mostrarPersona();
        
        Persona personaDos = new Persona();
        personaDos.nombre = "Maria";
        personaDos.apellido = "Prado";
        personaDos.mostrarPersona();
    }
}
