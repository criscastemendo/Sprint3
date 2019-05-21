package com.criscastemendo.sprint3.Data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Repositorio implements RepositorioContract{

  private List<ContadorItem> contadorItemList=new ArrayList<>();;

  private Context context;
  public static Repositorio INSTANCE;

  private int numcont = 0;
  private int cliks = 0;

  public static Repositorio getInstance(Context context) {
    if (INSTANCE == null) {
      INSTANCE = new Repositorio(context);
    }
    return INSTANCE;
  }

  public Repositorio(Context context) {this.context=context;
  }

  @Override
  public List<ContadorItem> getContadorItemList() {
    return contadorItemList;
  }

  @Override
  public void setContadorItemList(List<ContadorItem> contadorItemList) {
    this.contadorItemList = contadorItemList;
  }

  @Override
  public void nuevoContador(){

    contadorItemList.add(new ContadorItem(numcont,0));

    numcont++;

  }
  @Override
  public int getCliks() {
    return cliks;
  }

  @Override
  public void setCliks(int cliks1) {
    cliks = cliks1;
  }

  @Override
  public void sum(int cont) {

    contadorItemList.get(cont).setContador(contadorItemList.get(cont).getContador()+1);

    cliks++;

  }


}
