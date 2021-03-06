package com.criscastemendo.sprint3.Detalle;

import com.criscastemendo.sprint3.Data.ContadorItem;

import java.lang.ref.WeakReference;
import java.util.List;

interface DetalleContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(DetalleViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void aumentarContador();
    }

    interface Model {
        List<ContadorItem> fetchData();

        int getClick();

        void aumentarContador(int i);
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(DetalleState state);

        ContadorItem getDataFromPreviousScreen();
    }
}
