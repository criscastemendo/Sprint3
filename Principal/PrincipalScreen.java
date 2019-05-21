package com.criscastemendo.sprint3.Principal;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import com.criscastemendo.sprint3.Data.Repositorio;
import com.criscastemendo.sprint3.Data.RepositorioContract;
import com.criscastemendo.sprint3.app.AppMediator;

public class PrincipalScreen {

    public static void configure(PrincipalContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        PrincipalState state = mediator.getPrincipalState();
        RepositorioContract repositorioContract = Repositorio.getInstance(context.get());

        PrincipalContract.Router router = new PrincipalRouter(mediator);
        PrincipalContract.Presenter presenter = new PrincipalPresenter(state);
        PrincipalContract.Model model = new PrincipalModel(repositorioContract);
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
