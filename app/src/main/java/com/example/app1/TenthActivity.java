package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TenthActivity extends AppCompatActivity {
    double p, r, t, EMI;
    EditText Princi, ROI, TP;
    TextView ans;
    Button calc;
    Button NextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);


            Princi = (EditText) findViewById(R.id.PrincAmtVal);
            ROI = (EditText) findViewById(R.id.RoiVal);
            TP = (EditText) findViewById(R.id.TpVal);
            ans = (TextView) findViewById(R.id.Op);
            calc = (Button) findViewById(R.id.Calculate);
            NextPage = (Button) findViewById(R.id.NextPage);
        NextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(TenthActivity.this, EleventhActivity.class);
                startActivity(intent);
            }});
            calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        p = Double.parseDouble(Princi.getText().toString());
                        r = Double.parseDouble(ROI.getText().toString());
                        t = Double.parseDouble(TP.getText().toString());
                    }
                    catch(Exception e)
                    {
                        ans.setText("Enter all the data");
                        return;
                    }
                    r = r/1200;
                    EMI = p*r*(Math.pow(1+r, t)/(Math.pow(1+r, t)-1));
                    ans.setText(Double.toString(EMI));
                }
            });
        }
        @Override
        public void onPointerCaptureChanged(boolean hasCapture) {
            super.onPointerCaptureChanged(hasCapture);
        }
    }
