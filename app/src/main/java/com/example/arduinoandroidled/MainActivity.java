package com.example.arduinoandroidled;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toggleBtn = findViewById(R.id.Toggle);

        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!flag) {
                    flag = true;
                    TextView mainTxt = findViewById(R.id.NumberView);
                    mainTxt.setText("ON");
                    mainTxt.setTextColor(Color.parseColor("#00FF00"));
                } else {
                    flag = false;
                    TextView mainTxt = findViewById(R.id.NumberView);
                    mainTxt.setText("OFF");
                    mainTxt.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });


    }
}