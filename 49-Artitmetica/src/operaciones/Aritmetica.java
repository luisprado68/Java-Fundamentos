
package operaciones;

public class Aritmetica {
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Ejecutando el contructor");
    }
    public Aritmetica(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    public int obtenerSuma(){
        return this.a + this.b;
    }
    
    public int sumarArgumentos(int a,int b){
        this.a = a;
        this.b = b;
        return this.obtenerSuma();
    }
}
