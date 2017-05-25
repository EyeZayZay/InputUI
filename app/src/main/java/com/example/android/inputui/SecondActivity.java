package com.example.android.inputui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        Bundle b = intent.getExtras();

        String input = b.getString("input");

        tvView.setText(input);

    }
}
