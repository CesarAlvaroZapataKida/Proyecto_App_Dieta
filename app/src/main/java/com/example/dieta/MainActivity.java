package com.example.dieta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btngoogle, btnyoutube1,usuario,btnplay,btnpause;
    Button salir,datos,dieta;
    MediaPlayer mp,musica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btngoogle = findViewById(R.id.btngoogle);
        btnyoutube1 = findViewById(R.id.btnyoutube);
        btnpause = findViewById(R.id.btnpause);
        btnplay = findViewById(R.id.btnplay);
        mp= MediaPlayer.create(this,R.raw.sonido);
        musica=MediaPlayer.create(this,R.raw.musica);
        usuario=findViewById(R.id.btnUsuario);
        datos=findViewById(R.id.btnIngresar);
        salir=findViewById(R.id.btnSalir);
        dieta=findViewById(R.id.btnComida);
        musica.start();


        //dieta
        dieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent inten = new Intent(MainActivity.this,dieta.class);
                startActivity(inten);

            }
        });
        //pause
        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                musica.pause();

            }
        });





        //play
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                musica.start();
            }
        });

        //salir
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        //usuario
        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent inten = new Intent(MainActivity.this,Usuario.class);
                startActivity(inten);
            }
        });
        //datos
        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent inten = new Intent(MainActivity.this,datos.class);
                startActivity(inten);
            }
        });

    }

    public void google(View view){
        mp.start();

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fatsecret.es/"));
        startActivity(i);
    }
    public void youtube(View view){
        mp.start();

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=e9ZfsAPbIsE"));
        startActivity(i);
    }
}