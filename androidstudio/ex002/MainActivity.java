package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView c;
    private boolean lock;
    private Button b14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    c = findViewById(R.id.cels);
    b14 = findViewById(R.id.tbl);

    }
    public void b0 (View view){
       if (lock==false){
        String n;
        n =c.getText().toString();
        n = n + "0";
        c.setText(n);
        }
    }
    public void b1 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "1";
            c.setText(n);
        }
    }
    public void b2 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "2";
            c.setText(n);
        }
    }
    public void b3 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "3";
            c.setText(n);
        }
    }
    public void b4 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "4";
            c.setText(n);
        }
    }
    public void b5 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "5";
            c.setText(n);
        }
    }
    public void b6 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "6";
            c.setText(n);
        }
    }
    public void b7 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "7";
            c.setText(n);
        }
    }
    public void b8 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "8";
            c.setText(n);
        }
    }
    public void b9 (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + "9";
            c.setText(n);
        }
    }
    public void bp (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = n + ".";
            c.setText(n);
        }
    }
    public void bb (View view){
        if (lock==false){
            String n;
            n =c.getText().toString();
            n = "";
            c.setText(n);
        }
    }
    public void bl (View view){
        if (lock==false){
            lock = true;
            b14.setText("UNLOCK");
        } else{
            lock = false;
            b14.setText("LOCK");
        }
    }
}