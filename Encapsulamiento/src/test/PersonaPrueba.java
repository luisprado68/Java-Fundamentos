
package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona pUno = new Persona("Luis",50000.00,false);
        
//        System.out.println("Nombre: "+ pUno.getNombre());
//        System.out.println("Sueldo: "+ pUno.getSueldo());
//        System.out.println("Eliminado: "+ pUno.isEliminado());
        
        //el metodo println llama al metodo toString por defecto si existe
        System.out.println("Persona"+pUno);
    }
}
