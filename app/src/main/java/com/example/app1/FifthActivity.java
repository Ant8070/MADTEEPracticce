package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

import org.w3c.dom.Text;

public class FifthActivity extends AppCompatActivity {

    TextView result;
    Spinner spinner;
    ArrayAdapter adapter;
    Button NextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        result = findViewById(R.id.textViewResult);
        spinner = findViewById(R.id.countries);
        NextPage = (Button) findViewById(R.id.NextPage);

        adapter = ArrayAdapter.createFromResource(this,R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String country = parent.getItemAtPosition(position).toString();
                result.setText(country);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(FifthActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });
    }
}