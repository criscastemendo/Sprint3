package com.criscastemendo.sprint3.Principal;

import android.util.Log;

import com.criscastemendo.sprint3.Data.ContadorItem;
import com.criscastemendo.sprint3.app.AppMediator;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class PrincipalPresenter implements PrincipalContract.Presenter {

    public static String TAG = PrincipalPresenter.class.getSimpleName();

    private WeakReference<PrincipalContract.View> view;
    private PrincipalViewModel viewModel;
    private PrincipalContract.Model model;
    private PrincipalContract.Router router;
    private AppMediator mediator;

    public PrincipalPresenter(PrincipalState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<PrincipalContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(PrincipalContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(PrincipalContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // set passed state
        viewModel.contadorItemList=model.fetchData();
        PrincipalState state= router.getDataFromPreviousScreen();
        state.contadorItemList=viewModel.contadorItemList;
        router.passDataToNextScreen(state);
        // update the view
        view.get().displayData(viewModel);

    }

    @Override
    public void addContadorToList(){


        model.addContadorToList();
        fetchData();

    }

    @Override
    public void selectContadorListData(ContadorItem item) {
        router.passDataToDetalleScreen(item);
        router.navigateToDetalleScreen();
    }

}
