/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author CE39207770
 */
public class HerenciaTest {
    public static void main(String[] args) {
        Empleado empleadoUno = new Empleado(5000, "Luis Prado");
        System.out.println("empleadoUno = " + empleadoUno);
        
        
        var fecha = new Date();
        Cliente cliente = new Cliente(fecha,true,"Celeste",'f',25,"Lomas de Zamora 15");
        System.out.println("cliente = " + cliente);
    }
}
