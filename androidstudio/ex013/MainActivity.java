package com.rierapau.provasqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etCodigo, etNombre, etPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCodigo = findViewById(R.id.etCodigo);
        etNombre = findViewById(R.id.etNombre);
        etPrecio = findViewById(R.id.etPrecio);

    }

    public void nuevoProducto(View view) {
        AdminSQLiteOpenHelper conexion = new AdminSQLiteOpenHelper(this, "sqLiteDatabase", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();

        String codigo = etCodigo.getText().toString();
        String nombre = etNombre.getText().toString();
        String precio = etPrecio.getText().toString();
        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()) {
            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("nombre", nombre);
            registro.put("precio", precio);
            bd.insert("productos", null, registro);
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }
        bd.close();
        conexion.close();
    }
    public void buscarProducto(View view){
        AdminSQLiteOpenHelper conexion = new AdminSQLiteOpenHelper(this, "sqLiteDatabase", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();

        String codigo = etCodigo.getText().toString();

        if (!codigo.isEmpty()) {
            Cursor registros = bd.rawQuery("SELECT nombre, precio FROM preductos WHERE codigo = " +codigo,null);
            if(registros.moveToFirst()){
                etNombre.setText(registros.getString(0));
                etPrecio.setText(registros.getString(1));
            }else{
                Toast.makeText(this, "No se ha encontrado el producto", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Debes indicar el codigo", Toast.LENGTH_SHORT).show();
        }
        bd.close();
        conexion.close();
    }
    public void modificarProducto(View view) {
        AdminSQLiteOpenHelper conexion = new AdminSQLiteOpenHelper(this, "sqLiteDatabase", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();

        String codigo = etCodigo.getText().toString();
        String nombre = etNombre.getText().toString();
        String precio = etPrecio.getText().toString();
        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()) {
            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("nombre", nombre);
            registro.put("precio", precio);
            int numRegistros = bd.update("productos",registro,"codigo="+codigo,null);
            if (numRegistros == 1){
                Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }
        bd.close();
        conexion.close();
    }
    public void eliminarProducto(View view) {
        AdminSQLiteOpenHelper conexion = new AdminSQLiteOpenHelper(this, "sqLiteDatabase", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();

        String codigo = etCodigo.getText().toString();
        if (!codigo.isEmpty()) {
            int numRegistros = bd.delete("productos","codigo="+codigo,null);
            if (numRegistros == 1){
                etNombre.setText("");
                etCodigo.setText("");
                etPrecio.setText("");
                Toast.makeText(this, "Producto eliminado correctamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "producto inexistente", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "introduce un codigo valido", Toast.LENGTH_SHORT).show();
        }
        bd.close();
        conexion.close();
    }
    public void verProductos(View view){
        Intent verListado = new Intent(this,ListadoActivity.class);
        startActivity(verListado);
    }
}