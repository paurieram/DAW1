package com.rierapau.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String videojuegos[] = {"Pokémon: Let's Go, Pikachu!", "Xenoblade Chronicles 2", "Super Mario Party", "Luigi's Mansion 3", "Super Smash Bros. Ultimate", "Animal Crossing: New Horizons", "Narita Boy", "The Plane Effect", "Turrican Flashback", "Redout: Space Assault"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videojuegos);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("titulo",videojuegos[position]);
                intent.putExtra("posicion",position);
                startActivity(intent);
            }
        });
    }
}