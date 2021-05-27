package com.example.porzzioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView e;
    private TextView p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    e =findViewById(R.id.o1);
    p =findViewById(R.id.o2);
    }
    public void Auth (View view){
        String em = e.getText().toString();
        String pa = p.getText().toString();

        if (em.equals("usuario@email.com") && pa.equals("user1234")){
            Intent k = new Intent(getApplicationContext(), PersonalizarActivity.class);
            startActivity(k);
        }else{
            //Toast.makeText( context this, text "La contraseña o lusuari son incorrectes", Toast.LENGTH_LONG).show();
        }
    }

    private void show() {
    }
}