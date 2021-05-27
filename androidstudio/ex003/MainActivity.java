package com.example.conversordeeuros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void afegeixTasca(View view) {
        double euros;
    }
        double num;
        double res;

        num = double.paarseDouble(num.getText().toString());
        res = num * 1.89;
        num.setText(res.toString() + " $");

}