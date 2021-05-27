package com.example.uf2act1_persistencia_de_dades_en_fitxers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private ListView lv1;
    private ConstraintLayout cl1;
    private Switch sw1;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl1 = findViewById(R.id.clFondo);
        rb1 = findViewById(R.id.rbPink);
        rb2 = findViewById(R.id.rbSky);
        rb3 = findViewById(R.id.rbDark);
        tv1 = findViewById(R.id.tvTitulo);

        SharedPreferences preferences = getSharedPreferences("pref", Context.MODE_PRIVATE);
        String titulo = preferences.getString("tareaPr", "");

        if (titulo.length() > 0) {
            Intent obrirLlista = new Intent(this, TareaActivity.class);
            obrirLlista.putExtra("titulo", titulo);
            startActivity(obrirLlista);
        }

        lv1 = findViewById(R.id.lvTareas);

        String[] archivos = fileList();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_principal, archivos);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent obrirLlista = new Intent(getApplicationContext(), TareaActivity.class);
                obrirLlista.putExtra("titulo", lv1.getItemAtPosition(position).toString());
                startActivity(obrirLlista);
            }
        });

        String theme = preferences.getString("theme", "");

        if (theme.length() > 0) {
            if (theme.equals("dark")) {
                cl1.setBackgroundColor(Color.parseColor("#333333"));
                lv1.setBackgroundColor(Color.parseColor("#9b9b9b"));
                tv1.setTextColor(Color.WHITE);
                rb1.setTextColor(Color.WHITE);
                rb2.setTextColor(Color.WHITE);
                rb3.setTextColor(Color.WHITE);
            } else if (theme.equals("sky")) {
                cl1.setBackgroundColor(Color.parseColor("#5DBEF5"));
                lv1.setBackgroundColor(Color.parseColor("#B4ECFF"));
                tv1.setTextColor(Color.RED);
                rb1.setTextColor(Color.RED);
                rb2.setTextColor(Color.RED);
                rb3.setTextColor(Color.RED);
            }
        }
    }

    public void theme(View view) {
        SharedPreferences colorFondo = getSharedPreferences("pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = colorFondo.edit();

        if (rb3.isChecked()) {
            cl1.setBackgroundColor(Color.parseColor("#333333"));
            lv1.setBackgroundColor(Color.parseColor("#9b9b9b"));
            tv1.setTextColor(Color.WHITE);
            rb1.setTextColor(Color.WHITE);
            rb2.setTextColor(Color.WHITE);
            rb3.setTextColor(Color.WHITE);
            editor.putString("theme", "dark");
        } else if (rb2.isChecked()) {
            cl1.setBackgroundColor(Color.parseColor("#5DBEF5"));
            lv1.setBackgroundColor(Color.parseColor("#B4ECFF"));
            tv1.setTextColor(Color.RED);
            rb1.setTextColor(Color.RED);
            rb2.setTextColor(Color.RED);
            rb3.setTextColor(Color.RED);
            editor.putString("theme", "sky");
        } else {
            cl1.setBackgroundColor(Color.parseColor("#C2185B"));
            lv1.setBackgroundColor(Color.parseColor("#FF80AB"));
            tv1.setTextColor(Color.BLUE);
            rb1.setTextColor(Color.BLUE);
            rb2.setTextColor(Color.BLUE);
            rb3.setTextColor(Color.BLUE);
            editor.putString("theme", "pink");
        }
        editor.commit();
    }

    public void nuevaTarea(View view) {
        Intent afegirLlista = new Intent(getApplicationContext(), TareaActivity.class);
        startActivity(afegirLlista);
    }
}