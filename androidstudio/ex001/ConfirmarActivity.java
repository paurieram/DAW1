package com.example.porzzioni;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmarActivity extends AppCompatActivity {
private TextView N;
private TextView T;
private TextView B;
private TextView P;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         Double Na;
         String Ta;
         String Bb;
         Double Pa;
        setContentView(R.layout.activity_confirmar);
        N = findViewById(R.id.NumeroI2);
        T = findViewById(R.id.Tamaño2);
        B = findViewById(R.id.borde2);
        P = findViewById(R.id.Preu2);



        Na = getIntent().getDoubleExtra("n", 0);
        Ta = getIntent().getStringExtra("tamaño");
        Bb = getIntent().getStringExtra("borde");
        Pa = getIntent().getDoubleExtra("pr",0);

        N.setText(Na.toString());
        T.setText(Ta);
        B.setText(Bb);
        P.setText(Pa.toString()+"€");
    }
}