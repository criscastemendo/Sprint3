package com.criscastemendo.sprint3.Principal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.criscastemendo.sprint3.Data.ContadorItem;
import com.criscastemendo.sprint3.R;

public class PrincipalActivity
        extends AppCompatActivity implements PrincipalContract.View {

    public static String TAG = PrincipalActivity.class.getSimpleName();

    private PrincipalContract.Presenter presenter;
    private PrincipalAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        @SuppressLint("WrongViewCast") FloatingActionButton btn= (FloatingActionButton) findViewById(R.id.floatingActionButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            presenter.addContadorToList();
            }
        });

        listAdapter = new PrincipalAdapter(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ContadorItem item = (ContadorItem) view.getTag();
                presenter.selectContadorListData(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.category_list);
        recyclerView.setAdapter(listAdapter);
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
        //((TextView) findViewById(R.id.data)).setText(viewModel.data);
    }
}
