
package com.gm.mundopc;


public class DispositivoEntrada {
    
    protected String tipoEntrada;
    protected String marca;
    
    public DispositivoEntrada(){
        this.tipoEntrada = "";
        this.marca = "";
    }
    
    public DispositivoEntrada( String tipoEntrada,String marca){
        this();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{tipoEntrada=").append(this.tipoEntrada);
        sb.append(", marca=").append(this.marca);
        sb.append('}');
        return sb.toString();
    }
    
}
