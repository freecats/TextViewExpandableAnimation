package com.freecats.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.freecats.demo.view.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_normal_mode).setOnClickListener(this);
        findViewById(R.id.btn_recycler_view_mode).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_normal_mode) {
            Intent intent = new Intent(this, NormalModeActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.btn_recycler_view_mode) {
            Intent intent = new Intent(this, RecyclerViewModeActivity.class);
            startActivity(intent);
        }

    }
}
