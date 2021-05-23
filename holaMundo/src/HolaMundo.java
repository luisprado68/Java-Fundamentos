
import java.util.Scanner;


public class HolaMundo {

    public static void main(String args[]) {
        //System.out.println("Hola mundo desde java");

        int numero = 185;
        System.out.println(numero);

        String cadena = "Luis Prado";
        System.out.println(cadena);

        cadena = "Nada";
        System.out.println(cadena);

        //VAR
        var cadenaDos = "Luis";
        var numeroDos = 120;

        System.out.println(cadenaDos);
        System.out.println("numeroDos = " + numeroDos);

        //CONCATENACION ENTRE INT Y STRING
        //depende del orden si primero es string concatenara
        int i = 100;
        int j = 200;
        String cadenaTres = "Luisito Comunica";

        System.out.println(cadenaTres + i + j);
        //si priomero es entero y entero suma o flota o tipo de numero
        System.out.println(i + j + cadenaTres);
        //podemos poner parentesis para dar prioridad
        System.out.println(cadenaTres + (i + j));
        
        //SCANNER
        //se debe importa util para utilizar la clase
        System.out.println("*****************************************");
        System.out.println("Escribe tu nomnbre:");
        Scanner consola = new Scanner(System.in);
        //generamos el objeto para leer la informacion que se ingrese de
        //consola con el metoddo para leer una linea
    
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        System.out.println("Escribe  edad");
        var  edadAdulto = Integer.parseInt(consola.nextLine()); 
        System.out.println("edad = " + edadAdulto +  " y Nombre:  " +nombre);
        
        // CONVERSIONES
        
        var edad = Integer.parseInt("150");
        System.out.println("edad = " + edad);
        var edadDos = Double.parseDouble("3.1416");
        System.out.println("edadDos = " + edadDos);
        //de int a string
        var edadTexto = String.valueOf(18);
        System.out.println("edadTexto = " + edadTexto);
        //de string a char con el metodo le indicamos el indice del caracter
        var charsito = "luis".charAt(1);
        System.out.println("charsito = " + charsito);
    }
}
