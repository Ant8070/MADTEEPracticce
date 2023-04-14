package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FourthActivity extends AppCompatActivity {
    Button ok;
    RadioGroup radioGroup;
    RadioButton green;
    RadioButton red;
    RadioButton yellow;
    LinearLayout layout;
    Button NextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        ok = findViewById(R.id.buttonOk);
        radioGroup = findViewById(R.id.group);
        green = findViewById(R.id.radioButtonGreen);
        red = findViewById(R.id.radioButtonRed);
        yellow = findViewById(R.id.radioButtonYellow);
        layout = findViewById(R.id.lineer);
        NextPage = (Button) findViewById((R.id.NextPage));


        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (green.isChecked())
                {
                    layout.setBackgroundColor(Color.GREEN);
                }
                else if (red.isChecked())
                {
                    layout.setBackgroundColor(Color.RED);
                }
                else if (yellow.isChecked())
                {
                    layout.setBackgroundColor(Color.YELLOW);
                }

            }
        });


    }
}