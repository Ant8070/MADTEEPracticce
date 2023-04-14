package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etNum1;
    EditText etNum2;
    Button Add;
    Button Sub;
    Button Mult;
    Button Div;
    Button NextPage;
    TextView Result;
    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.et1);
        etNum2 = (EditText) findViewById(R.id.et2);
        Add = (Button) findViewById((R.id.button));
        Sub = (Button) findViewById(R.id.button1);
        Mult = (Button) findViewById(R.id.button3);
        Div = (Button) findViewById(R.id.button2);
        Result = (TextView) findViewById(R.id.textView);
        NextPage = (Button) findViewById(R.id.intentional) ;
        Add.setOnClickListener(this);
        Sub.setOnClickListener(this);
        Mult.setOnClickListener(this);
        Div.setOnClickListener(this);
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if(TextUtils.isEmpty(etNum1.getText().toString() )|| TextUtils.isEmpty(etNum2.getText().toString())){
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat((etNum2.getText().toString()));

        switch (v.getId()){
            case R.id.button:
                oper = "+";
                result = num1+num2;
                break;
            case R.id.button1:
                oper = "-";
                result = num1-num2;
                break;
            case R.id.button3:
                oper = "*";
                result=num1*num2;
                break;
            case R.id.button2:
                oper ="/";
                result = num1/num2;
                break;
            default:
                break;

        }
        Result.setText(num1+" "+oper+" "+num2+" "+"=" + " "+result);

    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture){
        super.onPointerCaptureChanged(hasCapture);
    }

}