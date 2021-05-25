
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;
    
   
    public Teclado(String tipoEntrada,String marca ){
        super(tipoEntrada,marca);
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{idTeclado=").append(this.idTeclado);
        sb.append("\n");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
