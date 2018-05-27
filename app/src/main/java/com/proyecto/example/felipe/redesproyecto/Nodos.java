package com.proyecto.example.felipe.redesproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Nodos extends AppCompatActivity {
   public  TextView texto1;
   public  TextView texto2;
   public  TextView texto3;
   public String recibiendodatos;
   public String recibiendodatos2;
   public String recibiendodatos3;
   public CardView ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        texto1 = (TextView) findViewById(R.id.txtNombre);
        recibiendodatos = getIntent().getStringExtra("DATOS");
        texto1.setText(recibiendodatos);
        texto2 = (TextView) findViewById(R.id.txtMarca);
        recibiendodatos2 = getIntent().getStringExtra("DATOS2");
            texto2.setText(recibiendodatos2);
            texto3=(TextView) findViewById(R.id.txtPuerto);
            recibiendodatos3= getIntent().getStringExtra("DATOS3");
        texto3.setText(recibiendodatos3);
        CardView ca = (CardView) findViewById(R.id.container1);
        ca.setVisibility(View.VISIBLE);



    }
    public void agregardispositivo (View view)
    {
        Intent intent = new Intent(Nodos.this, AgregarDispositivo.class);
        startActivity(intent);

    }

}
