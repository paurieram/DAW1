package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
    }

        public void rellenaMail(View view) {
        String mail;


        mail = etEmail.getText().toString();
        mail = mail + "@gmail.com";

        etEmail.setText(mail);
        }
    }
}