package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    TextView result;
    CheckBox male;
    CheckBox female;
    Button NextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        result = findViewById(R.id.textViewResult);
        male = findViewById(R.id.checkBoxMale);
        female = findViewById(R.id.checkBoxFemale);
        NextPage = findViewById(R.id.NextPage);
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        male.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (male.isChecked()){
                    result.setText(("Male"));
                    female.setChecked(false);;
                }else
                {
                    result.setText("What is your gender?");
                }
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (female.isChecked())
                {
                    result.setText("Female");
                    male.setChecked(false);
                }
                else
                {
                    result.setText("What is your gender?");
                }

            }
        });


    }
}