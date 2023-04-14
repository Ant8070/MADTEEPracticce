package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EighthActivity extends AppCompatActivity {

    EditText et1;
    Button btn_convert;
    TextView tvr;
    Button NextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        et1 = (EditText) findViewById(R.id.et1);
        btn_convert=(Button) findViewById((R.id.btn_convert));;
        tvr = (TextView) findViewById(R.id.tv_result);
        NextPage = (Button) findViewById(R.id.NextPage);
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(EighthActivity.this, NinthActivity.class);
                startActivity(intent);
            }
        });
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double meters = Double.parseDouble(et1.getText().toString());
                double centimeters = meters * 100;
                tvr.setText(centimeters + " cm");
            }
        });

    }
}