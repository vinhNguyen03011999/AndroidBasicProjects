package com.example.lol;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class Akali extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akali);

    }
    public void home(View view) {

        Intent intent = new Intent(Akali.this, MainActivity.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
}
