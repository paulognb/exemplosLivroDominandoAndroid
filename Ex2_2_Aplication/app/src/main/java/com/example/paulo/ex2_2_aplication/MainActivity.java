package com.example.paulo.ex2_2_aplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTextMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTextMain = (EditText)findViewById(R.id.edtTextActivity);

        Button btnMain = (Button)findViewById(R.id.btn1Activity);
        btnMain.setOnClickListener(this);
        Button btn2Main = (Button)findViewById(R.id.btn2Activity);
        btn2Main.setOnClickListener(this);
    }

        public void onClick(View view){
            switch (view.getId()){
                case (R.id.btn1Activity):
                    String inputText = edtTextMain.getText().toString();
                    Toast.makeText(this,inputText,Toast.LENGTH_SHORT).show();
                    break;
                case (R.id.btn2Activity):
                    Intent it = new Intent(this,Main2Activity.class);
                    startActivity(it);
                    break;
            }
        }
}
