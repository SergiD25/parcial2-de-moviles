package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tn;
    private TextView ta;
    private TextView td;
    private TextView vc;

    private TextView vlunt;
    private TextView cred;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /**calcuklo de la recursividad del subtotal*/

        int vlr;

        tn = (TextView) findViewById(R.id.nombre2);
        String nombre = getIntent().getStringExtra("nombre");
        tn.setText(nombre);
        ta = (TextView) findViewById(R.id.apellidos2);
        String apellido = getIntent().getStringExtra("apellido");
        ta.setText(apellido);
        td = (TextView) findViewById(R.id.documento2);
        String documento = getIntent().getStringExtra("documento");
        td.setText(documento);
        vc = (TextView) findViewById(R.id.ccreditos);
        String creditos = getIntent().getStringExtra("creditos");
        vc.setText(creditos);

        vlunt = (TextView) findViewById(R.id.subtotal);



    }

     
}