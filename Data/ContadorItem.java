package com.criscastemendo.sprint3.Data;

public class ContadorItem {

    public int id;
    public int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void contadorsum(int contador){
        this.contador=contador++;
    }


}
