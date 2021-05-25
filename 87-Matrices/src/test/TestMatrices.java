
package test;

import domain.Persona;


public class TestMatrices {
    public static void main(String[] args) {
        int edades [][] = new int [3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 15;
        edades[1][0] = 87;
        edades[1][1] = 20;
        edades[2][0] = 65;
        edades[2][1] = 22;
        
        for (int fila = 0; fila < edades.length; fila++) {
            
            for (int col = 0; col < edades[fila].length; col++) {
                
                System.out.println("fila: "+fila+" columna: "+col +" Valor: "+ edades[fila][col]);
            }
        }
        String frutas[][] = {{"Banana","Frutilla"},{"Naranja","Sandia","Anana"}};
        
        for (int fila = 0; fila < frutas.length; fila++) {
            
            for (int col = 0; col < frutas[fila].length; col++) {
                
                System.out.println("fila: "+fila+" columna: "+col +" Valor: "+ frutas[fila][col]);
            }
        }
        
        
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Luis");
        personas[0][1] = new Persona("Amadeo");
        personas[0][2] = new Persona("Laura");
        personas[1][0] = new Persona("Sara");
        personas[1][1] = new Persona("Mariano");
        personas[1][2] = new Persona("Mateo");
        
        imprimir(personas);
        
    }
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 System.out.println("fila: "+i+" columna: "+j +" Valor: "+ matriz[i][j]);
            }
        }
    }
}
