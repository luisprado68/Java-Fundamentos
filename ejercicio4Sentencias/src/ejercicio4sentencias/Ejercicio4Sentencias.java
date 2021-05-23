/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4sentencias;

import java.util.Scanner;

/**
 *
 * @author CE39207770
 */
public class Ejercicio4Sentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var valor = Integer.parseInt(consola.nextLine());
        
        if(valor == 9 | valor == 10){
            System.out.println("A");
        }
        else if(valor == 8 &&valor < 9){
            System.out.println("B");
        }
        else if(valor == 7 &&valor < 8){
            System.out.println("C");
        }
        else if(valor == 6 &&valor < 7){
            System.out.println("D");
        }
        else if(valor  >= 0 && valor < 6){
            System.out.println("F");
        }
        else{
            System.out.println("Valor desconocido");
        }
        
    }
}