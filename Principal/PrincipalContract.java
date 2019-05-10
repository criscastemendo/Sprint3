package com.criscastemendo.sprint3.Principal;

import com.criscastemendo.sprint3.Data.ContadorItem;

import java.lang.ref.WeakReference;
import java.util.List;

interface PrincipalContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(PrincipalViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void addContadorToList();

        void selectContadorListData(ContadorItem item);
    }

    interface Model {
        String fetchData();

        void addContadorToList(List<ContadorItem> contadorItemList);
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(PrincipalState state);

        PrincipalState getDataFromPreviousScreen();

        void passDataToDetalleScreen(ContadorItem item);

        void navigateToDetalleScreen();
    }
}
