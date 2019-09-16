package com.vinhnguyen.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] studnets = new String[]{"L","S","V","T"};
        LinearLayout main = findViewById(R.id.MainLayout);
        for (int i = 0; i < studnets.length ; i++){
            LinearLayout ngang = new LinearLayout(this);
            Button buttonplus = new Button(MainActivity.this);
            TextView output = new TextView(MainActivity.this);
            output.setText("\n"+ studnets[i] +"\n");
            output.setWidth(1200);
            buttonplus.setText("+");
            buttonplus.setTextSize(20);
            ngang.addView(output);
            ngang.addView(buttonplus);
            main.addView(ngang);
        }
    }


}
