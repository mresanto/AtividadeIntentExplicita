package com.example.atividade3var;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private CheckBox checkbox;
    private RadioGroup radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.txtNome);
        checkbox = (CheckBox) findViewById(R.id.checkBox);
        radiogroup = (RadioGroup) findViewById(R.id.rdbG);

    }
    public void onClickEnviar(View View){
        String nome = editText.getText().toString();
        Boolean check = checkbox.isChecked();
        int radio = radiogroup.getCheckedRadioButtonId();
        String radiobutton = findViewById(radiogroup);

        Intent intentEnviar = new Intent(getApplicationContext(), SegundaActivity.class);
        Bundle parametros = new Bundle();

        parametros.putString("chave_nome", nome);
        parametros.putBoolean("chave_check", check);
        parametros.putString("chave_radio", radiobutton);

        intentEnviar.putExtra(parametros);
        startActivity(intentEnviar);
    }

}