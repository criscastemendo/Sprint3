package com.criscastemendo.sprint3.Detalle;

import com.criscastemendo.sprint3.Data.ContadorItem;
import com.criscastemendo.sprint3.Data.Repositorio;

import java.util.List;

public class DetalleModel implements DetalleContract.Model {

    public static String TAG = DetalleModel.class.getSimpleName();

    public Repositorio repositorio;

    public DetalleModel(Repositorio repositorio) {
        this.repositorio= repositorio;
    }

    @Override
    public List<ContadorItem> fetchData() {
        // Log.e(TAG, "fetchData()");

        return repositorio.getContadorItemList();

    }
    @Override
    public int getClick(){

        return repositorio.getCliks();

    }

    @Override
    public void aumentarContador(int i){

        repositorio.sum(i);

    }

}
