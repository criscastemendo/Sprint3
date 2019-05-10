package com.criscastemendo.sprint3.Principal;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

public class PrincipalModel implements PrincipalContract.Model {

    public static String TAG = PrincipalModel.class.getSimpleName();

    public PrincipalModel() {

    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
