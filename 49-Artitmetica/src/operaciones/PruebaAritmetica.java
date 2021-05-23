package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        Aritmetica aritmeticaUno = new Aritmetica();
        aritmeticaUno.a = 5;
        aritmeticaUno.b = 10;
        aritmeticaUno.sumar();
        System.out.println("Suma es: " +  aritmeticaUno.obtenerSuma());
        
        
        System.out.println("suma argumentos "+ aritmeticaUno.sumarArgumentos(10, 20));
        //verificamos si modifica los datos del objeto si modifica
        aritmeticaUno.sumar();
        
        Aritmetica aritemticaDos = new Aritmetica(10,50);
        aritemticaDos.sumar();
    }
}
