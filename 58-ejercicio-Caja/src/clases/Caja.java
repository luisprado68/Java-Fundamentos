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
public class Caja {
    int ancho;
    int profundo;
    int alto;
    
    public Caja(){
        this.ancho = 0;
        this.profundo = 0;
        this.alto = 0;
    }
    
    public Caja(int ancho,int profundo,int alto){
        this.ancho = ancho;
        this.profundo = profundo;
        this.alto = alto;
    }
    
    public int  volumen(){
        return this.ancho * this.alto * this.profundo;
    }
}

