
package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int num = 10;
        System.out.println("num = " + num);
        
        //num = 20; No se puede modificar la variable una vez indicada como final
        
        //imprimimos la constante
        System.out.println("constante: " + Persona.MI_CONSTANTE);
        
        //Ejemplo de final a un objeto
        final Persona persona = new Persona();
        //persona = new Persona()
        
        persona.setNombre("Luisito");
        System.out.println("persona = " + persona.getNombre());
        
        persona.setNombre("Carlitos");
        System.out.println("persona = " + persona.getNombre());
    }
}
