
package test;

import domain.Persona;


public class TestArreglosObjetos {
    
    public static void main(String[] args) {
        Persona personas [] = new Persona[2];
        
        personas[0]= new Persona("Luis Prado");
        personas[1]= new Persona("Amadeo Oliva");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("indice = " + i + " Valor:"+ personas[i]);
        }
        
    }
}
