package com.marcasru.buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /* Array booleà de dues dimensions que representa el camp de mines.
    El valor true indicarà que en aquella casella hi ha una bomba. El valor
    false indicarà que en aquella casella no hi ha cap bomba */
    private boolean[][] campo=new boolean[12][9];
    /* Variable que comptabilitza en nombre d'encerts de l'usuari, és a dir,
    nombre de caselles obertes sense morir. Quan aquesta variable arribi a 93
    significarà que l'usuari ha guanyat la partida */
    private int aciertos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Reset();
    }
    public void Reset() {
        for(int i=0;i<campo.length;i++){
            for(int j=0;j<campo.length;j++){
                campo[i][j]=false;
            }
        }
    }
    public void trobar(int fil, int col, boolean[][] cas) {
        for (int i=0;i<=11;i++){
            for(int j=0;j<=8;j++){
                if (fil>=0 && fil<=8 && col>=0 && col<=11){

                }
            }
        }
    }
    public void abrirCasilla(View view) {
        /* Variable que emmagatzema la posició de la casella oberta
        per l'usuari */
        String posicion, aux;
        int fila,columna;
        /* Objecte de tipus TextView que quedarà associat al TextView
        corresponent a la casella oberta per l'usuari */
        TextView casilla;
        posicion = view.getTag().toString();
        casilla = findViewById(view.getId());
        aux = posicion.substring(0,2);
        fila = Integer.parseInt(aux);
        aux = posicion.substring(3,5);
        columna = Integer.parseInt(aux);
        int b=0;
        for (int i=-1;i!=1;i++){
            if (fila+i>=0 && fila+i<=11){
                for(int j=-1;j!=1;j++){
                    if (columna+j>=0 && columna +j<=8){
                        if (campo[fila+i][columna+j]==true){
                            b++;
                        }
                    }
                }
            }
        }
        casilla.setText(Integer.toString(b));
        if (b==0){
            casilla.setBackgroundColor(Color.parseColor("#7CFC00"));
        }else if  {
            casilla.setBackgroundColor(Color.parseColor("#FFA500"));
        }else {
            casilla.setBackgroundColor(Color.parseColor("#FF0000"));
        }
        //campo[fila][columna]
        /* La següent línia s'ha d'eliminar (o comentar), simplement
        serveix perquè puguis veure com es rep la posició de la
        casella oberta per l'usuari */
        Toast.makeText(this, posicion, Toast.LENGTH_SHORT).show();
    }
}
