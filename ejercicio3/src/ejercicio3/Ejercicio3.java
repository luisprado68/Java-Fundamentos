/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author CE39207770
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
//        System.out.println("Proporciona el ancho:");
//        var ancho = Integer.parseInt(consola.nextLine());
//        System.out.println("Proporciona el alto:");
//        var alto = Integer.parseInt(consola.nextLine());
//        var area = ancho * alto;
//        var perimetro = (ancho + alto) * 2;
//
//        System.out.println("Area: = " + area + "\nPerimetro:" + perimetro);
        
        System.out.println("Proporciona el numero1:");
        var numUno = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciona el numero2:");
        var numDos = Integer.parseInt(consola.nextLine());
        var mayor = numUno > numDos ? numUno : numDos;
        System.out.println("El numero mayor es:"+ mayor);
    }

}
