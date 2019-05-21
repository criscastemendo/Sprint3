package com.criscastemendo.sprint3.Data;

public class ContadorItem {

    private int id;
    private int contador;

    public ContadorItem(int id, int contador){
        this.id=id;
        this.contador=contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
