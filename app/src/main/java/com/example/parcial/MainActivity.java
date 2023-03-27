package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText ed1;
    private EditText ed2;
    private EditText ed3;
    private EditText ed4;
    private EditText ed5;
    private EditText ed6;
    private EditText ed7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.nombre);
        ed2 = (EditText) findViewById(R.id.apellidos);
        ed3 = (EditText) findViewById(R.id.direccion);
        ed4 = (EditText) findViewById(R.id.telefono);
        ed5 = (EditText) findViewById(R.id.edad);
        ed6 = (EditText) findViewById(R.id.creditos);
        ed7 = (EditText) findViewById(R.id.documento);










    }

    public void Enviar(View view)
    {
        Intent enviar = new Intent(this,MainActivity2.class);
        enviar.putExtra("nombre",ed1.getText().toString());
        enviar.putExtra("apellido",ed2.getText().toString());


        enviar.putExtra("creditos",ed6.getText().toString());


        enviar.putExtra("documento",ed7.getText().toString());
        startActivity(enviar);
    }


}