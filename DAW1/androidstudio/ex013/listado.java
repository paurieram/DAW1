package com.rierapau.provasqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listado extends AppCompatActivity {
    private ListView lvProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        lvProductos=findViewById(R.id.lvProductos);
        AdminSQLiteOpenHelper conexion = new AdminSQLiteOpenHelper(this, "sqLiteDatabase", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();
        Cursor registros = bd.rawQuery("SELECT nombre FROM productos",null);
        String productos[] = new String[registros.getCount()];
        while(registros.moveToNext()) {
            productos[registros.getPosition()] = registros.getString(0);
        }
        bd.close();
        conexion.close();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item,productos);
        lvProductos.setAdapter(adapter);
    }
}