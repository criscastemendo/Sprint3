package com.criscastemendo.sprint3.Principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.criscastemendo.sprint3.R;

public class PrincipalActivity
        extends AppCompatActivity implements PrincipalContract.View {

    public static String TAG = PrincipalActivity.class.getSimpleName();

    private PrincipalContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // do the setup
        PrincipalScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(PrincipalContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(PrincipalViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.data)).setText(viewModel.data);
    }
}
