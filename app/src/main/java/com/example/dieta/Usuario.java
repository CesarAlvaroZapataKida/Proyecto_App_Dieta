package com.example.dieta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Usuario extends AppCompatActivity {
    MediaPlayer mp;
    TextView txtnombre,txtapellido,txtpeso,txtdieta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        txtnombre = findViewById(R.id.txtnombre);
        txtapellido = findViewById(R.id.txtapellido);
        txtpeso = findViewById(R.id.txtpeso);
        txtdieta = findViewById(R.id.txtdieta);

        String nombre= getIntent().getStringExtra("nombre");
        String apellido= getIntent().getStringExtra("apellido");
        String peso= getIntent().getStringExtra("peso");
        txtnombre.setText("Hola "+nombre);
        txtapellido.setText(""+apellido);
        txtpeso.setText("Tu peso es de: "+peso);
        txtdieta.setText("Quieres Bajar de Peso");

    }
    public void atras(View view){
        mp.start();
        Intent intent = new Intent(Usuario.this,MainActivity.class);

        startActivity(intent);

    }
}