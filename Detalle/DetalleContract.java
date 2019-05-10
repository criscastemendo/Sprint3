package com.criscastemendo.sprint3.Detalle;

import java.lang.ref.WeakReference;

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
    }

    interface Model {
        String fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(DetalleState state);

        DetalleState getDataFromPreviousScreen();
    }
}
