package com.rierapau.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    private TextView tv2;
    private TextView tv3;
    private String detalles[] = {"Pokémon: Let’s Go, Pikachu! y Pokémon: Let's Go, Eevee! llevan la experiencia de un RPG clásico a Nintendo Switch con chulísimos gráficos en alta definición. La dinámica de juego es lo suficientemente sencilla como para que los jugadores más nóveles disfruten de su primera incursión en Pokémon. Al mismo tiempo, los Entrenadores más veteranos encontrarán no pocos retos para poner a prueba su destreza",
            "Explora un océano infinito de nubes entre las que perviven los restos de una civilización a lomos de enormes bestias llamadas Titanes en Xenoblade Chronicles 2 para Nintendo Switch. Descubre la historia de Rex y su nueva amiga, Pyra, un ser misterioso ser conocido como Blade que le otorga enorme poder. Juntos emprenderán la búsqueda del hogar perdido de Pyra, el Elíseo, el último paraíso de la humanidad",
            "El juego de mesa original sube el listón con elementos de estrategia más profunda, como dados específicos para cada personaje. También cuenta con nuevas formas de jugar, incluidos minijuegos manejados con los Joy-Con y nuevos modos para disfrutar con la familia y amigos",
            "Luigi se ha embarcado en unas vacaciones de ensueño junto a Mario y sus amigos, tras ser invitados a hospedarse en un lujoso hotel. Sin embargo, lo que prometía ser unas vacaciones inolvidables se convierte enseguida en una pesadilla horrible cuando el Rey Boo revela que todo era una trampa para atrapar a Mario y compañía",
            "¿Puede Link derrotar a Mario? ¿Puede Yoshi tumbar a Donkey Kong? ¿Puede Kirby darle una paliza a Pikachu? Descúbrelo en Super Smash Bros para Nintendo Switch. Antes de Super Smash Bros Melee para Nintendo Gamecube, estas y otras viejas preguntas encontraron respuesta inmediata con Super Smash Bros para Nintendo 64, el juego original de lucha por torneos con todas las estrellas de Nintendo. Así, podrás enfrentar entre sí a los personajes más populares de Nintendo",
            "Hasta ahora has conocido a personajes de lo más variopinto, te lo has pasado de miedo en la gran ciudad y puede que hasta hayas decidido darle un giro a tu vida trabajando en la alcaldía. Sin embargo, hay una parte de ti que anhela… ¡la libertad en estado puro! Quieres hacer lo que te apetezca en cualquier momento. Quizá la solución sea darse un largo paseo por la playa de una isla desierta, en la que aguarda un verdadero tesoro de naturaleza virgen...",
            "Una aventura de acción radical con el legendario héroe pixelado atrapado como un simple eco dentro de Digital Kingdom. Descubre el misterio tras la Techno-sword y cruza espadas con los Stallions corruptos y malditos. ¡Salva el mundo! Narita Boy es una aventura de acción a cargo de Studio Koba y Team17 para PC, PlayStation 4, Xbox One y Switch",
            "The Plane Effect es una aventura atmosférica a cargo de Innovina y PQube para PC, PlayStation 5, Xbox Series y Switch ambientada en un futuro distópico en el que acomapañamos a Solo de regreso a su casa y en la que se generan más preguntas que respuestas",
            "Vuelve le legendaria serie de Turrican. Disfruta de 4 juegos de acción clásicos en esta colección pionera que te trae unos niveles gigantescos, una música impresionante y unos controles modernizados. La experiencia de juego retro que estabas esperando! ¡Descubre todos los secretos, rebélate ante las máquinas y forma parte del 30 aniversario de uno de los hitos del mundo de los videojuegos. Turrican Flashback es un plataformas de acción tipo run and gun a cargo de Factor 5 e ININ Games para PlayStation 4 y Switch",
            "Redout: Space Assault es la batalla espacial de acción tipo shoot'em up más rápida y épica que podrás experimentar a cargo de 34BigThings para PC, PlayStation 4, Xbox One y Switch. Debes superar en inteligencia, maniobrabilidad, potencia y nivel a tus oponentes en un combate espacial para un jugador a toda velocidad y repleto de adrenalina"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        tv2= findViewById(R.id.tv2);
        tv3= findViewById(R.id.tv3);
        tv2.setText(getIntent().getStringExtra("titulo"));
        tv3.setText(detalles[getIntent().getIntExtra("posicion", 0)]);
    }
}