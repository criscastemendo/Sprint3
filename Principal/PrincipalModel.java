package com.criscastemendo.sprint3.Principal;

import java.util.List;

import com.criscastemendo.sprint3.Data.ContadorItem;
import com.criscastemendo.sprint3.Data.RepositorioContract;

public class PrincipalModel implements PrincipalContract.Model {

    public static String TAG = PrincipalModel.class.getSimpleName();

    private RepositorioContract repositorio;

    public PrincipalModel (RepositorioContract repositorio) {
        this.repositorio = repositorio;
    }

    public PrincipalModel() {

    }

    @Override
    public List<ContadorItem> fetchData() {
        // Log.e(TAG, "fetchData()");
        return repositorio.getContadorItemList();
    }

    @Override
    public void addContadorToList() {

        repositorio.nuevoContador();


    }
}
