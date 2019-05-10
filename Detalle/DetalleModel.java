package com.criscastemendo.sprint3.Detalle;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class DetalleModel implements DetalleContract.Model {

    public static String TAG = DetalleModel.class.getSimpleName();

    public DetalleModel() {

    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
