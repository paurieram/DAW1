package com.example.porzzioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class PersonalizarActivity extends AppCompatActivity {
private TextView num;
private TextView total;
private RadioButton peque;
private RadioButton media;
private RadioButton grande;
private Switch S;
private boolean borde;
    private boolean uno;
    private boolean dos;
    private boolean tres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizar);

        num = findViewById(R.id.Number);
        total = findViewById(R.id.textView3);
        peque = findViewById(R.id.radioButton);
        media = findViewById(R.id.radioButton2);
        grande = findViewById(R.id.radioButton3);
        S = findViewById(R.id.switch2);


        uno = false;
        dos = false;
        tres = false;
        borde = false;

    }
public void hola(View view) {
    Double numm;
    Double PreuTotal;
    Double PreuTotal2;
    Double pr = 0.0;
    Double n = null;
    String t = null;
    String b;

    PreuTotal = 0.0;
    PreuTotal2 = 0.0;
    numm = 1.0;
    numm = Double.parseDouble(num.getText().toString());

    if (uno) {
        PreuTotal = 5 + (numm * 0.5);
        total.setText(PreuTotal.toString());
    } else if (dos) {
        PreuTotal = 6 + (numm * 1.25);
        total.setText(PreuTotal.toString());
    } else if (tres) {
        PreuTotal = 7 + (numm * 2);
        total.setText(PreuTotal.toString());
    }

    if (borde) {
        PreuTotal2 = PreuTotal + 2;
        total.setText(PreuTotal2.toString());
    } else {

    }

  
}
 public void seguent(View view) {
     Double numm;
     Double PreuTotal;
     Double pr = 0.0;
     Double n = null;
     String t = null;
     String b;
     numm = Double.parseDouble(num.getText().toString());
     PreuTotal = Double.parseDouble(total.getText().toString());

     if (uno) {
         t = "Pequeña";
         pr = PreuTotal;
         n = numm;
     } else if (dos) {
         t = "Mediana";
         pr = PreuTotal;
         n = numm;
     } else if (tres) {
         t = "Grande";
         pr = PreuTotal;
         n = numm;
     }

     if (borde) {
         b = "Con borde";
     } else {
         b = "Sin borde";
     }


     Intent intent = new Intent(this, ConfirmarActivity.class);
     intent.putExtra("tamaño", t);
     intent.putExtra("borde", b);
     intent.putExtra("pr", pr);
     intent.putExtra("n", n);
     startActivity(intent);
 }

    public void bor(View view) {
        if (!borde) {
            borde = true;
            S.setText("Amb bordes");
        } else {
            borde = false;
            S.setText("Sense bordes");
        }
    }


    public void unoo(View view) {
        if (!uno) {
            tres = false;
            dos = false;
            uno = true;
        }
    }


    public void doss(View view) {
        if (!dos) {
            tres = false;
            dos = true;
            uno = false;
        }
    }


    public void tress(View view) {
        if (!tres) {
            tres = true;
            dos = false;
            uno = false;
          }
        }


}