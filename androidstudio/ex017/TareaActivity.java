package com.example.uf2act1_persistencia_de_dades_en_fitxers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TareaActivity extends AppCompatActivity {

    private Switch sw1;
    private EditText et1;
    private EditText et2;
    private ConstraintLayout cl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea);

        sw1 = findViewById(R.id.swPrioritat);
        et1 = findViewById(R.id.etNombreTarea);
        et2 = findViewById(R.id.etDetalleTarea);
        cl1 = findViewById(R.id.clFondo);

        SharedPreferences colorFondo = getSharedPreferences("pref", Context.MODE_PRIVATE);
        String theme = colorFondo.getString("theme", "");

        if (theme.length() > 0) {
            if (theme.equals("dark")) {
                cl1.setBackgroundColor(Color.parseColor("#333333"));
                et1.setBackgroundColor(Color.parseColor("#9b9b9b"));
                et2.setBackgroundColor(Color.parseColor("#9b9b9b"));
            } else if (theme.equals("sky")) {
                cl1.setBackgroundColor(Color.parseColor("#5DBEF5"));
                et1.setBackgroundColor(Color.parseColor("#B4ECFF"));
                et2.setBackgroundColor(Color.parseColor("#B4ECFF"));
            } else {
                cl1.setBackgroundColor(Color.parseColor("#C2185B"));
                et1.setBackgroundColor(Color.parseColor("#FF80AB"));
                et2.setBackgroundColor(Color.parseColor("#FF80AB"));
            }
        } else {
            cl1.setBackgroundColor(Color.parseColor("#C2185B"));
            et1.setBackgroundColor(Color.parseColor("#FF80AB"));
            et2.setBackgroundColor(Color.parseColor("#FF80AB"));
        }

        String[] archivos = fileList();

        if (getIntent().hasExtra("titulo")) {
            String titol = getIntent().getStringExtra("titulo");
            if(ArchivoExiste(archivos, titol)) {
                try {
                    InputStreamReader archivo = new InputStreamReader(openFileInput(titol));
                    BufferedReader br = new BufferedReader(archivo);
                    String linea = br.readLine();
                    String fileFull = "";

                    while (linea != null) {
                        fileFull += linea + "\n";
                        linea = br.readLine();
                    }
                    et1.setText(titol);
                    et2.setText(fileFull);
                    br.close();
                    archivo.close();

                } catch (IOException e) {

                }
            }

        }
    }

    private boolean ArchivoExiste (String [] archivos, String nArchivo) {
        for (int i = 0; i < archivos.length; i++) {
            if(nArchivo.equals(archivos[i])) {
                return true;
            }
        }
        return false;
    }

    public void guardarTarea(View view) {

        String titulo = et1.getText().toString();
        SharedPreferences tareasImportantes = getSharedPreferences("pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = tareasImportantes.edit();

        if (sw1.isChecked()) {
            editor.putString("tareaPr", titulo);
            editor.commit();

        } else {
            String titulo2 = tareasImportantes.getString("tareaPr", "");
            if (titulo2.length() > 0 && titulo2.equals(titulo)) {
                editor.putString("tareaPr", "");
                editor.commit();
            }
        }

        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(titulo, Activity.MODE_PRIVATE));
            archivo.write(et2.getText().toString());
            archivo.flush();
            archivo.close();
        } catch (IOException e) {

        }
        Toast.makeText(this, "Tarea guardada correctamente", Toast.LENGTH_SHORT).show();

        Intent iniciarMain = new Intent(getApplicationContext(), MainActivity.class);
        iniciarMain.putExtra("titulo", et1.getText().toString());
        startActivity(iniciarMain);

    }
}