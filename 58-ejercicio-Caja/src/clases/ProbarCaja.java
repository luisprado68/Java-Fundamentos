/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author CE39207770
 */
public class ProbarCaja {
    public static void main(String[] args) {
        
        Caja cajita = new Caja(3,6,2);
        int resultado = cajita.volumen();
        System.out.println("resultado = " + resultado);
    }
}
