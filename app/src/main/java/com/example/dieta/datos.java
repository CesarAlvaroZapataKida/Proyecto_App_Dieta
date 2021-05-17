package com.example.dieta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class datos extends AppCompatActivity {
    MediaPlayer mp;
    Button guardar;
    EditText nombre,apellido,peso;
    RadioButton hombre,mujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        mp= MediaPlayer.create(this,R.raw.sonido);
        guardar=findViewById(R.id.btnGuardar);
        nombre= findViewById(R.id.etNombre);
        apellido= findViewById(R.id.etApellido);
        peso= findViewById(R.id.etPeso);
        hombre= findViewById(R.id.rbSubir);
        mujer= findViewById(R.id.rbBajar);

    }

    public void enviar(View view){
        mp.start();
        Intent intent = new Intent(this, Usuario.class);
        intent.putExtra("nombre",nombre.getText().toString());
        intent.putExtra("apellido",apellido.getText().toString());
        intent.putExtra("peso",peso.getText().toString());

        startActivity(intent);

    }


}