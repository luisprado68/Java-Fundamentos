
package com.gm.mundopc;

public class MundoPc {
    public static void main(String[] args) {
        Raton r1 = new Raton("USB","Hyperx");
        Teclado t1 = new Teclado("USB","Hyperx");
        Monitor monitor1 = new Monitor("Samsung",25);
        Computadora compu1 = new Computadora("LG",monitor1,t1,r1);
        
        Orden o1 = new Orden();
        o1.agregarComputadora(compu1);
        o1.mostrarOrden();
        
    }
}
