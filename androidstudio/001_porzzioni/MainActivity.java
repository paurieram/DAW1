package com.example.porzzioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText contra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.email);
        contra = findViewById(R.id.contrasenya);
    }

    public void entra (View view) {

         if (email.getText().toString().equals("usuario@email.com")&&contra.getText().toString().equals("user1234"))
        {
            Intent intent =new Intent(this, PersonalizarActivity.class);
            startActivity(intent);
        } else {
             Toast.makeText(this, "Dades Incorrecta", Toast.LENGTH_LONG).show();
         }








 }

}