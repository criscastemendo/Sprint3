package com.criscastemendo.sprint3.Detalle;

import android.annotation.SuppressLint;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.criscastemendo.sprint3.R;

public class DetalleActivity
        extends AppCompatActivity implements DetalleContract.View {

    public static String TAG = DetalleActivity.class.getSimpleName();

    private DetalleContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        @SuppressLint("WrongViewCast") FloatingActionButton btn= (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //presenter.add();
            }
        });
        // do the setup
        DetalleScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(DetalleContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(DetalleViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.counter)).setText(viewModel.data);
        ((TextView) findViewById(R.id.clicks)).setText(viewModel.clicks);
    }
}
