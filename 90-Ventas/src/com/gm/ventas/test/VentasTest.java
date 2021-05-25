
package com.gm.ventas.test;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;


public class VentasTest {
    public static void main(String[] args) {
        
        Producto p = new Producto("Monitor",25000);
        Producto p2 = new Producto("Ram 8g",6000);
        
        Orden o = new Orden();
        o.agregarProducto(p);
        o.agregarProducto(p2);
        o.mostrarOrden();
    }
}
