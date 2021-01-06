package com.example.zpo_l11_zad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnValueForXClick(View view) {
        final EditText equation = (EditText) findViewById(R.id.edtInsert);
        Intent intent = new Intent(this, ValueForXActivity.class);
        intent.putExtra(EXTRA_MESSAGE, equation.getText().toString());
        startActivity(intent);
    }

    public void onBtnDerivativeClick(View view) {
        final EditText equation = (EditText) findViewById(R.id.edtInsert);
        Intent intent = new Intent(this, DerivativeActivity.class);
        intent.putExtra(EXTRA_MESSAGE, equation.getText().toString());
        startActivity(intent);
    }
}