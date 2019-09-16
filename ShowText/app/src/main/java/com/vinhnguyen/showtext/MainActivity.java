package com.vinhnguyen.showtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    public void show(View view) {
        EditText input = findViewById(R.id.input);
        String text = input.getText().toString();

        TextView output = new TextView(MainActivity.this);
//        output.setText(output.getText().toString()+text+"\n");
        output.setText(text);

        LinearLayout main = findViewById(R.id.MainLinear);
        main.addView(output);

    }
}
