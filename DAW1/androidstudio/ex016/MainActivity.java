package com.rierapau.tasachozas;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static int M;
    private static RadioButton NC;
    private static RadioButton BE;
    private static RadioButton PR;
    private static Switch P;
    private static TextView T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_segona);

        TextView m = findViewById(R.id.M2);
        M = Integer.parseInt(m.toString());
        NC = findViewById(R.id.NC);
        BE = findViewById(R.id.BE);
        PR = findViewById(R.id.PR);
        P = findViewById(R.id.P);
        T = findViewById(R.id.T);
    }
    public void Tasa(View view){
        int r=0;
        if (M!=0) {
            if (NC.isChecked()) {
                r = r + (M * 1700);
            } else if (BE.isChecked()) {
                r = r + (M * 1500);
            } else if (PR.isChecked()) {
                r = r + (M * 1100);
            }
            if (P.isChecked()) {
                r = r + (M * 1000);
            }
        }
        T.setText(r);
    }
}