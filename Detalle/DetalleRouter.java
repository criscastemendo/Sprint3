package com.criscastemendo.sprint3.Detalle;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import com.criscastemendo.sprint3.app.AppMediator;

public class DetalleRouter implements DetalleContract.Router {

    public static String TAG = DetalleRouter.class.getSimpleName();

    private AppMediator mediator;

    public DetalleRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, DetalleActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(DetalleState state) {
        mediator.setDetalleState(state);
    }

    @Override
    public DetalleState getDataFromPreviousScreen() {
        DetalleState state = mediator.getDetalleState();
        return state;
    }
}
