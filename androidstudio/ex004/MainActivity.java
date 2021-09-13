package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ta;
    private EditText te;
    private TextView tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ta = findViewById(R.id.act);
        te = findViewById(R.id.exa);
        tr = findViewById(R.id.res);
    }

    public void CN (View view){
        double a = Double.parseDouble(ta.getText().toString());
        double e = Double.parseDouble(te.getText().toString());
        if (a <= 10 && a >= 0 && e <= 10 && e >= 0){
            double n = a * 0.4 + e * 0.6;
            tr.setText(Double.toString(n));
        }else {
            Toast.makeText( this,  "Tarea añadida correctamente", Toast.LENGTH_LONG).show());
        }
    }

    private void show() {

    }
}