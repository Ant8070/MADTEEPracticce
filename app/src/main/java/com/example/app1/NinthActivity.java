package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NinthActivity extends AppCompatActivity {
    EditText heightInput;
    EditText weightInput;
    TextView resultText;
    Button calc;
    Button NextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        heightInput=(EditText) findViewById(R.id.height_input);
        weightInput=(EditText) findViewById(R.id.weight_input);
        resultText=(TextView) findViewById(R.id.result_text);
        calc = (Button) findViewById(R.id.calculate_button);
        NextPage = (Button) findViewById(R.id.NextPage);
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(NinthActivity.this, TenthActivity.class);
                startActivity(intent);
            }});
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = heightInput.getText().toString();
                String weightStr = weightInput.getText().toString();
                if(heightStr!= null && !heightStr.isEmpty() && weightStr != null && !weightStr.isEmpty()){
                    double height = Double.parseDouble(heightStr);
                    double weight = Double.parseDouble(weightStr);
                    double bmi = weight/(height*height);
                    String bmilabel;
                    if(bmi <18.5){
                        bmilabel="UnderWeight";
                    }else if(bmi<25){
                        bmilabel="Healthy";
                    }else {
                        bmilabel="OverWeight";
                    }
                    resultText.setText("Your BMI is " + bmi + " (" + bmilabel + ")");
                }else {
                    Toast.makeText(NinthActivity.this, "Please enter the height and weight",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}