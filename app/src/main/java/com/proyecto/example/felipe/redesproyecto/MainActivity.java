package com.proyecto.example.felipe.redesproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Conectar(View view)
    {
        Intent intent = new Intent(MainActivity.this, Nodos.class);


        startActivity(intent);
    }
}
