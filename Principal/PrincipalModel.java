package com.criscastemendo.sprint3.Principal;

import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;
import com.criscastemendo.sprint3.Data.ContadorItem;

public class PrincipalModel implements PrincipalContract.Model {

    public static String TAG = PrincipalModel.class.getSimpleName();

    public PrincipalModel() {

    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }

    @Override
    public void addContadorToList(List<ContadorItem> contadorItemList) {

        Log.e(TAG, String.valueOf(contadorItemList.size()));


    }
}
