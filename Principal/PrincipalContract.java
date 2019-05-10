package com.criscastemendo.sprint3.Principal;

import java.lang.ref.WeakReference;

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
    }

    interface Model {
        String fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(PrincipalState state);

        PrincipalState getDataFromPreviousScreen();
    }
}
