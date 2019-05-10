package com.criscastemendo.sprint3.Detalle;

import android.util.Log;

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
        DetalleState state = router.getDataFromPreviousScreen();
        if (state != null) {
            viewModel.data = state.data;
        }

        if (viewModel.data == null) {
            // call the model
            String data = model.fetchData();

            // set initial state
            viewModel.data = data;
        }

        // update the view
        view.get().displayData(viewModel);

    }


}
