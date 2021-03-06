package com.example.zpo_l11_zad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DerivativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derivative);

        Intent intent = getIntent();
        String equation = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String[] tab = equation.split(",");
        Polynomial polynomial = new Polynomial(tab);
        final TextView textView = (TextView) findViewById(R.id.tvResultDerivative);
        String url = "https://newton.now.sh/api/v2/derive/" + polynomial.toString();

        RequestQueue queue = Volley.newRequestQueue(this); // kolejka żądań

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // import Gson'a

        // można używać też GsonRequest, chociaż czasem nie działa
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, response ->
        {
            Result result = gson.fromJson(response, Result.class); // mapowanie odpowiedzi do klasy Response
            textView.setText(result.toString());


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("Something went wrong, try again");
            }
        }
        );

        queue.add(stringRequest); // dodanie do kolejki
    }

    public void onBtnReturnDerivativeClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}