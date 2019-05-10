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
        PrincipalState state = router.getDataFromPreviousScreen();
        if (state != null) {
            viewModel.contadorItemList = state.contadorItemList;
        }

        if (viewModel.contadorItemList == null) {

            viewModel.contadorItemList= new ArrayList<ContadorItem>();

        }

        // update the view
        view.get().displayData(viewModel);

    }

    @Override
    public void addContadorToList(){

        if (viewModel.contadorItemList == null) {
            viewModel.contadorItemList=new ArrayList();
            model.addContadorToList(viewModel.contadorItemList);
        }else{
            model.addContadorToList(viewModel.contadorItemList);
        }

    }

    @Override
    public void selectContadorListData(ContadorItem item) {

        router.passDataToDetalleScreen(item);
        router.navigateToDetalleScreen();
    }

}
