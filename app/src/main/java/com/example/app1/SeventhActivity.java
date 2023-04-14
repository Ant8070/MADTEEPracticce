package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class SeventhActivity extends AppCompatActivity {
    Button NextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        NextPage = (Button) findViewById(R.id.NextPage);
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SeventhActivity.this, EighthActivity.class);
                startActivity(intent);
            }
        });
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SeventhActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter((myAdapter));
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
                String str = String.valueOf(mySpinner.getSelectedItem());
                if(str.equals("Indian Sweets")){
                    imageView1.setImageResource(R.drawable.img1);
                }
                else if (str.equals("Bakery")){
                    imageView1.setImageResource(R.drawable.img1);
                }
                else if(str.equals("Milk and Milk products")){
                    imageView1.setImageResource(R.drawable.img1);
                }else{
                    return;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

                                            }
        );

    }
}