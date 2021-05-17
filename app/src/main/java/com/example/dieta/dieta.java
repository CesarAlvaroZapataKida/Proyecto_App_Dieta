package com.example.dieta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dieta extends AppCompatActivity {
    Button atras;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta);
        atras=findViewById(R.id.btnatras);

    }
    public void atras(View view){
        mp.start();
        Intent intent = new Intent(dieta.this,MainActivity.class);

        startActivity(intent);

    }
}