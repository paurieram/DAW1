package com.rierapau.mainactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TareaActivity extends AppCompatActivity {

    private EditText etNombreTarea;
    private EditText etDetalleTarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea);

        etDetalleTarea = findViewById(R.id.etDetalleTarea);
        etNombreTarea = findViewById(R.id.etNombreTarea);

        if (getIntent().hasExtra("position")) {
            String titulo = getIntent().getStringExtra("position");
            String texto = "";
            try {
                InputStreamReader archivo = new InputStreamReader(openFileInput(titulo));
                BufferedReader br = new BufferedReader((archivo));
                String linea = br.readLine();
                while (linea != null) {
                    texto += linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                etNombreTarea.setText(titulo);
                etDetalleTarea.setText(texto);
            } catch (IOException e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    }

    public void btGuardar(View view) {
        String titulo = etNombreTarea.getText().toString();
        String texto = etDetalleTarea.getText().toString();
        try {
            OutputStreamWriter output = new OutputStreamWriter(openFileOutput(titulo, Activity.MODE_PRIVATE));
            output.write(texto);
            output.flush();
            output.close();
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}