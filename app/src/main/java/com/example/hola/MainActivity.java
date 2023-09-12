package com.example.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int cedula;

    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        votacion="A";

        votacion_A=findViewById(R.id.votacion_A);

        votacion_A=findViewById(R.id.votacion_A);

        cedula =findViewById(R.id.cedula);

        Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);
        //datos a enviar
        enviarDatos.putExtra("nombre","juan carlos");
        enviarDatos.putExtra("votacion",votacion);
        enviarDatos.putExtra("Fecha","14/02/2010");
        enviarDatos.putExtra("cedula",71398272);
        startActivity(enviarDatos);
    }
}