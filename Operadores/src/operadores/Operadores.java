/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author CE39207770
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //para compara sttings
        
        var cadena = "hola";
        var cadenaDos = "adios";
        var cadenaTres = "hola";
        var resultado = cadena == cadenaDos;//eata comparando referencias de obj
        System.out.println("resultado = " + resultado);
        
        var f = cadena.equals(cadenaDos);//metodo equals comparamos 
        System.out.println("f = " + f);
        var g = cadena.equals(cadenaTres);
        System.out.println("g = " + g);
        
    }
    
}
