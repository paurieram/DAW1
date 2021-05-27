package com.rierapau.fitxer;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;
    private EditText et7;
    private final String NOM_FITXER="file";
    private final String NOM_PREF="pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.etGuardarFichero);
        et2 = findViewById(R.id.etLeerFichero);
        et3 = findViewById(R.id.etGuardarPreferences);
        et4 = findViewById(R.id.etLeerPreferences);
        et5 = findViewById(R.id.etGuardarBaseDatosCodigo);
        et6 = findViewById(R.id.etGuardarBaseDatosNombre);
        et7 = findViewById(R.id.etLeerBaseDatosNombre);
    }

    public void LeerFitxer(View view) {
        try {
            InputStreamReader archivo = new InputStreamReader(openFileInput(NOM_FITXER));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String fileFull = "";
            while (linea != null) {
                fileFull += linea + "\n";
                linea = br.readLine();
            }
            et2.setText(fileFull);
            br.close();
            archivo.close();
            Toast.makeText(this, "Texto cargado correctamente", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void guardarFixer(View view) {
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(NOM_FITXER, Activity.MODE_PRIVATE));
            archivo.write(et1.getText().toString());
            archivo.flush();
            archivo.close();
            Toast.makeText(this, "Texto guardado correctamente", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
        }
    }

    public void guardarpref(View view) {
        String text = et3.getText().toString();
        SharedPreferences sp = getSharedPreferences(NOM_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("texto", text);
        editor.commit();
        Toast.makeText(this, "Texto guardado correctamente", Toast.LENGTH_SHORT).show();
    }

    public void Leerpref(View view) {
        SharedPreferences sp = getSharedPreferences(NOM_PREF, Context.MODE_PRIVATE);
        String text = sp.getString("texto", "");
        et4.setText(text);
        Toast.makeText(this, "Texto cargado correctamente", Toast.LENGTH_SHORT).show();
    }

    public void Leersqlite(View view) {
        AdminSQLiteOpenHelper conexion = new AdminSQLiteOpenHelper(this, "productosDB", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();
        String codigo = et5.getText().toString();
        if (!codigo.isEmpty()) {
            Cursor registros = bd.rawQuery("SELECT nombre FROM productos WHERE codigo=" + codigo, null);
            if (registros.moveToFirst()) {
                et7.setText(registros.getString(0));
            } else {
                Toast.makeText(this, "Producto inexistente", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Debe indicar el código del producto", Toast.LENGTH_SHORT).show();
        }
        bd.close();
    }

    public void guardatsqlite(View view) {
        AdminSQLiteOpenHelper conexion = new AdminSQLiteOpenHelper(this, "productosDB", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();
        String codigo = et5.getText().toString();
        String nombre = et6.getText().toString();
        if (!codigo.isEmpty() && !nombre.isEmpty()) {
            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("nombre", nombre);
            bd.insert("productos", null, registro);
            et5.setText("");
            et6.setText("");
            Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Todos los campos son obligatorio", Toast.LENGTH_SHORT).show();
        }
        bd.close();
    }
}