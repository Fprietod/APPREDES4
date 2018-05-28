package com.proyecto.example.felipe.redesproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AgregarDispositivo extends AppCompatActivity implements  View.OnClickListener {
   public EditText textonombre;
   public EditText textomarca;
   public EditText textopuerto;
   public Button btnEnviarDatos;
   //----------------------------------container1
    public EditText textonombrelabel2;
    public EditText textomarca2;
    public EditText textopuerto3;
    //-------------------------------------container2
    public EditText textonombrelabel3;
    public EditText textomarca3;
    public EditText textopuerto4;
    //-------------------------------------------container3



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_dispositivo);
        textonombre= (EditText) findViewById(R.id.NombreDispositivo);
        textomarca= (EditText) findViewById(R.id.idMarcar);
        textopuerto = (EditText) findViewById(R.id.idPuerto);
        btnEnviarDatos= (Button) findViewById(R.id.btnAgregar);
        btnEnviarDatos.setOnClickListener(this); //Evento(click es escuchado)

            }
    @Override
    public void onClick(View v) { //se activa evento
    switch (v.getId()) {

        case R.id.btnAgregar:
            String dato; //capturar informacion
            String dato2;
            String dato3;
            //Hssta aquí es el container 1
            Intent intent; //Para pasar actividad
            dato=textonombre.getText().toString();
            dato2= textomarca.getText().toString();
            dato3 = textopuerto.getText().toString();
            //Hasta aquí es el container |
            intent = new  Intent(getApplicationContext(),Nodos.class);
            intent.putExtra("DATOS",dato);
            intent.putExtra("DATOS2",dato2);
            intent.putExtra("DATOS3",dato3);


            startActivity(intent);
            break;
            default:

                break;
    }
      }
      }


















