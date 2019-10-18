package com.example.imageview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private ImageView imageView;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageView = (ImageView) this.findViewById(R.id.imageView);

        this.button1 = (Button) this.findViewById(R.id.button1);
        this.button2 = (Button) this.findViewById(R.id.button2);

        this.button1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                showImage1();
            }
        });

        this.button2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                showImage2();
            }
        });
    }


    private void showImage1() {
        this.imageView.setImageResource(R.drawable.ic_launcher_background);
    }

    private void showImage2() {
        this.imageView.setImageResource(R.drawable.lubo);
    }

}