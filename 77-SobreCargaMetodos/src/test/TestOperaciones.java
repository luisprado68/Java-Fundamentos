
package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(10, 4);
        System.out.println("resultado = " + resultado);
        
        var resultadoDos = Operaciones.sumar(15.0, 20.0);
        System.out.println("resultado = " + resultadoDos);
    }
}
