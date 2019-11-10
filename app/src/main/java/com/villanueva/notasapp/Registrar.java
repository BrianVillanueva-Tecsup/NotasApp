package com.villanueva.notasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {

    Button btn_ir_inicioSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        btn_ir_inicioSesion=findViewById(R.id.ir_inicio_sesion);
        btn_ir_inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registrar.this,Login.class));
                finish();
            }
        });
    }
}
