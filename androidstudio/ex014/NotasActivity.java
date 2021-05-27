package com.rierapau.qualifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class NotasActivity extends AppCompatActivity {
    private TextView tv_al;
    private EditText et_np;
    private EditText et_ne;
    private TextView tv_nf;
    private String actitud[] = {"Buena actitud", "Actitud normal", "Mala actitud"};
    private Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        tv_al = findViewById(R.id.tv_al);
        et_np = findViewById(R.id.et_np);
        et_ne = findViewById(R.id.et_ne);
        tv_nf = findViewById(R.id.tv_nf);
        spin = findViewById(R.id.spinner);
        tv_al.setText(getIntent().getStringExtra("nombre"));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, actitud);
        spin.setAdapter(adapter);
    }
    public void calcular(View view){
        int n = Integer.parseInt(et_np.getText().toString());
        int e = Integer.parseInt(et_ne.getText().toString());
        Double r = ((n*0.3)+(e*0.5));
        //String yes =spin.getSelectedView().toString();
        //tv_nf.setText(yes.toString());
        //if (){
        //int num =spin.getPositionForView(view);
        // }
       tv_nf.setText(r.toString());
    }
}