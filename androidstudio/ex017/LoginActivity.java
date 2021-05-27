package com.example.uf2act1_persistencia_de_dades_en_fitxers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private Button b1;
    private CheckBox cb1;
    private ConstraintLayout cl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.etEmail);
        et2 = findViewById(R.id.etPassw);
        tv1 = findViewById(R.id.tvTitol);
        tv2 = findViewById(R.id.tvCorreu);
        tv3 = findViewById(R.id.tvPassw);
        b1 = findViewById(R.id.bEntrar);
        cb1 = findViewById(R.id.cbRecordar);
        cl1 = findViewById(R.id.clFondo);

        SharedPreferences preferences = getSharedPreferences("pref", Context.MODE_PRIVATE);
        String mail = preferences.getString("mail", "");
        String passw = preferences.getString("passw", "");

        if (mail.equals("user@mail.com") && passw.equals("user1234")) {
            Intent iniciarMain = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(iniciarMain);
        }
    }

    public void bEntrar(View view) {

        String mail = et1.getText().toString();
        String passw = et2.getText().toString();

        if (cb1.isChecked()) {
            SharedPreferences dadesLogin = getSharedPreferences("pref", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = dadesLogin.edit();
            editor.putString("mail", mail);
            editor.putString("passw", passw);
            editor.commit();
        }

        if (mail.equals("user@mail.com") && passw.equals("user1234") ) {
            Intent login = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(login);
        } else {
            Toast toast = Toast.makeText(this, "Les dades son incorrectes", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}