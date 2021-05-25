
package domain;

//no se puede heredar de una clase marcada como final
public class Empleado extends Persona//extends Persona{
{
    //no púede overradiar el metodo final
    @Override
    public  void imprimir(){
        System.out.println("Metodo imprimir desde la clase hija");
    }
}
