
package test;
import  ar.com.Uteleria;
//si tuvieramos mas clases en el mismo paquete se agrega * import  ar.com.*
//podemos importa el metodo a usar directo
//import ar.com.Uteleria.imprimir
public class TesteUtileria {
    public static void main(String[] args) {
        Uteleria.imprimir("Hola");
        //imprimir("Adios"); usando el segundo import
        
        
    }
}
