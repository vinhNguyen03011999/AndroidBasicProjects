package com.example.changescreenbyjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {

        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
}
