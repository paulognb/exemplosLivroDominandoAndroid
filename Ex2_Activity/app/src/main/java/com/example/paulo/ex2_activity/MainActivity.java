package com.example.paulo.ex2_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTexto = (EditText)findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
    }

    public void onClick(View view){
        String texto = edtTexto.getText().toString();
        Toast.makeText(this,texto, Toast.LENGTH_SHORT).show();
    }
}
