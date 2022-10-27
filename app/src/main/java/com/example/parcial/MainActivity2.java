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
    private TextView subtotal;

    private  TextView iva;

    private TextView total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /**calcuklo de la recursividad del subtotal*/


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
        String credito = getIntent().getStringExtra("creditos");
        vc.setText(credito);



        String numcreditos= vc.getText().toString();
        int creditoobt = Integer.parseInt(numcreditos);


        persona hola = new persona();
        hola.getpersona();

        vlunt = (TextView) findViewById(R.id.valorunt);
        vlunt.setText(Integer.toString(hola.getpersona()));



        subtotal = (TextView) findViewById(R.id.subtotal);
        Multi mt =new Multi();
        subtotal.setText(Integer.toString(mt.Multip(hola.getpersona(), creditoobt)));


        iva = (TextView) findViewById(R.id.iva);
        Iva iva1 = new Iva();
        iva.setText(Integer.toString(iva1.Iva1(mt.Multip(hola.getpersona(), creditoobt))));


        total = (TextView) findViewById(R.id.total);
        Total tl = new Total();
        total.setText(Integer.toString(tl.total(mt.Multip(hola.getpersona(), creditoobt), iva1.Iva1(mt.Multip(hola.getpersona(), creditoobt)))));



    }



}