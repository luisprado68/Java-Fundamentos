/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author CE39207770
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el id:");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        var envioGratuito  = Boolean.parseBoolean(consola.nextLine());
        System.out.println( nombre + " #"+id +"\nPrecio: $"+precio+ "\nEnvio Gratuito: "+envioGratuito);
        
        

    }

}
