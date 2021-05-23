/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author CE39207770
 */
public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        cambioValor(x);
        System.out.println("nuevo valor de x = " + x);
    }
    public static void cambioValor(int argu1){
        
        System.out.println("argu1 = " + argu1);
        argu1 = 15;
    } 
}
