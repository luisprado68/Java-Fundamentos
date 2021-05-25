
package test;


public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int[3];
        int j=1;
        for (int i = 0; i < edades.length; i++) {
            
            edades[i] = j++;
        }
        for (int i = 0; i < edades.length; i++) {
             
            System.out.println("indice : "+i+ " Valor: "+ edades[i]);
        }
        
        String frutas[] = {"Banana","Frutilla","Naranja"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("i = " + i + " valor: "+frutas[i]);
        }
    }
}
