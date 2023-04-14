package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Calendar;


public class EleventhActivity extends AppCompatActivity {
    EditText birthYearEditText;
    Button calculateAgeButton;
    TextView resultTextView;
    Button NextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        birthYearEditText = findViewById(R.id.birthYear);
        calculateAgeButton = findViewById(R.id.calculateAge);
        resultTextView = findViewById(R.id.result);
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(EleventhActivity.this, EleventhActivity.class);
                startActivity(intent);
            }});
        calculateAgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int birthYear =
                        Integer.parseInt(birthYearEditText.getText().toString());
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int age = currentYear - birthYear;
                resultTextView.setText("Your age is: " + age);
            }
        });
    }
}