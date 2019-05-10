package com.criscastemendo.sprint3.Detalle;

import android.util.Log;

import com.criscastemendo.sprint3.Data.ContadorItem;

import java.lang.ref.WeakReference;

public class DetallePresenter implements DetalleContract.Presenter {

    public static String TAG = DetallePresenter.class.getSimpleName();

    private WeakReference<DetalleContract.View> view;
    private DetalleViewModel viewModel;
    private DetalleContract.Model model;
    private DetalleContract.Router router;

    public DetallePresenter(DetalleState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<DetalleContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(DetalleContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(DetalleContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // set passed state
        ContadorItem contadorItem =model.fetchData();
        if (contadorItem != null) {
            viewModel.data = contadorItem.contador;
            //viewModel.clicks = ;
        }


        // update the view
        view.get().displayData(viewModel);

    }


}
