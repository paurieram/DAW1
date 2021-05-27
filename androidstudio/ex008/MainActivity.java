package com.rierapau.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView lvTareas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTareas = findViewById(R.id.lvTareas);
        String[] arrayFicheros = fileList();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listitem, arrayFicheros);
        lvTareas.setAdapter(adapter);
        lvTareas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent tarea = new Intent(getApplicationContext(), TareaActivity.class);
                tarea.putExtra("position", lvTareas.getItemAtPosition(position).toString());
                startActivity(tarea);
            }
        });
    }

    public void nuevaTarea(View view) {
        Intent tarea = new Intent(this, TareaActivity.class);
        startActivity(tarea);
    }
}