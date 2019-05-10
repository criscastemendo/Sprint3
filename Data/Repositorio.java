package com.criscastemendo.sprint3.Data;

import android.content.Context;

import java.util.List;

public class Repositorio {
  private ContadorItem contadorItem;
  private List<ContadorItem> contadorItemList;
  private Context context;
  public static Repositorio INSTANCE;
  private int cliks;

  public static Repositorio getInstance(Context context) {
    if (INSTANCE == null) {
      INSTANCE = new Repositorio(context);
    }
    return INSTANCE;
  }

  public Repositorio(Context context) {
    contadorItem= new ContadorItem();
    contadorItem.contador=0;
    contadorItem.id=0;
    cliks=0;
  }

  public ContadorItem getContadorItem() {
    return contadorItem;
  }

  public void setContadorItem(ContadorItem cont) {
    this.contadorItem = cont;
  }

  public int getCliks() {
    return cliks;
  }

  public void setCliks(int cliks) {
    this.cliks = cliks;
  }

  public int add(int cont) {
    return cont++;
  }

  public int addC(int cli) {
    return cli++;
  }
}
