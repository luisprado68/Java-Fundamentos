
package com.gm.mundopc;


public class Raton extends DispositivoEntrada {
    
    private int idRaton;
    private static int contadorRaton;
    
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada,marca);
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        this.idRaton = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{idRaton=").append(this.idRaton);
        sb.append("\n");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
