package com.criscastemendo.sprint3.Detalle;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import com.criscastemendo.sprint3.Data.Repositorio;
import com.criscastemendo.sprint3.app.AppMediator;

public class DetalleScreen {

    public static void configure(DetalleContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        DetalleState state = mediator.getDetalleState();
        Repositorio repositorio = Repositorio.getInstance(context.get());


        DetalleContract.Router router = new DetalleRouter(mediator);
        DetalleContract.Presenter presenter = new DetallePresenter(state);
        DetalleContract.Model model = new DetalleModel(repositorio);
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
