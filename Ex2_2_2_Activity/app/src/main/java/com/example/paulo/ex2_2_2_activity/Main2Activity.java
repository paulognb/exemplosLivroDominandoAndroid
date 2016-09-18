package com.example.paulo.ex2_2_2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewMain = (TextView)findViewById(R.id.textViewActivity);

        Intent intent = getIntent();

        Cliente cliente = intent.getParcelableExtra("cliente");
        if(cliente != null){
            String texto = String.format("Nome: %s / Código: %d",cliente.nome,cliente.codigo);
            textViewMain.setText(texto);
        }
        else{
            String nome = intent.getStringExtra("nome");
            int idade = intent.getIntExtra("idade",-1);
            textViewMain.setText(String.format("Nome: %s / Idade: %d",nome,idade));
        }
    }
}
