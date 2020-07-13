package com.example.atividade3var;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intentEnviado = getIntent();
        Bundle parametros = intentEnviado.getExtras();

        if(parametros != null) {

            String nome = parametros.getString("chave_nome");
            Boolean check = parametros.getBoolean("chave_check");
            String radio = parametros.getString("chave_radio");

            Toast.makeText(intentEnviado.this, "Nome =" + nome + "É veridíco o ódio:" + check + "Por qual razão =" + radio,Toast.LENGTH_SHORT.show());

        }
        }
    }
}