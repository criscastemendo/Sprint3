package com.criscastemendo.sprint3.Data;

import com.criscastemendo.sprint3.Detalle.DetalleState;
import com.criscastemendo.sprint3.Detalle.DetalleViewModel;

import java.lang.ref.WeakReference;
import java.util.List;

public interface RepositorioContract {


    List<ContadorItem> getContadorItemList();

    void setContadorItemList(List<ContadorItem> contadorItemList);

    void nuevoContador();

    int getCliks();

    void setCliks(int cliks1);

    void sum(int cont);
}
