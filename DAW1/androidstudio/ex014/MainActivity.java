package com.rierapau.qualifica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String alumnos[] = {"Nicolás Queroso", "Rubén Fermizo", "Susana Oria", "Jorge Nitales", "Helen Chufe", "Inés Queleto", "Enrique Cido", "Francisco Jones", "Lola Mento", "Josechu Letón"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alumnos);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(getApplicationContext(), NotasActivity.class);
                intent.putExtra("nombre",alumnos[position]);
                startActivity(intent);
            }
        });
    }
}