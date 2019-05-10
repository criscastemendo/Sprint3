package com.criscastemendo.sprint3.Detalle;

import com.criscastemendo.sprint3.Data.ContadorItem;
import com.criscastemendo.sprint3.Data.Repositorio;

public class DetalleModel implements DetalleContract.Model {

    public static String TAG = DetalleModel.class.getSimpleName();

    public Repositorio repositorio;

    public DetalleModel(Repositorio repositorio) {
        this.repositorio= repositorio;
    }

    @Override
    public ContadorItem fetchData() {
        // Log.e(TAG, "fetchData()");

        return repositorio.getContadorItem();

    }
}
