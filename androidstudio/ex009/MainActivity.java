package com.mistareas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText tasca;
private TextView llista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasca = findViewById(R.id.tasca);
        llista = findViewById(R.id.llista);
    }
    public void afegeixTasca(View view) {
        String novaTasca;
        String llistatTasques;
        novaTasca = tasca.getText().toString();
        llistatTasques = llista.getText().toString();
        llistatTasques = llistatTasques + "\n" + novaTasca;
        llista.setText(llistatTasques);
        tasca.setText("");
        Toast.makeText( context this, text "Tarea añadida correctamente", Toast.LENGTH_LONG).show());
    }

}