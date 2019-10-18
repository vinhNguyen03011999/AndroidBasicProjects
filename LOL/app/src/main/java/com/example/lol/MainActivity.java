package com.example.lol;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void home(View view) {

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
    public void Garen(View view) {

        Intent intent = new Intent(MainActivity.this, garen.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
    public void MasterYi(View view) {

        Intent intent = new Intent(MainActivity.this, Masteryi.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
    public void Aatrox(View view) {

        Intent intent = new Intent(MainActivity.this, Aatrox.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
    public void Ahri(View view) {

        Intent intent = new Intent(MainActivity.this, Ahri.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
    public void Akali(View view) {

        Intent intent = new Intent(MainActivity.this, Akali.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }

    public void Alistar(View view) {

        Intent intent = new Intent(MainActivity.this, Alistar.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }

    public void Amumu(View view) {

        Intent intent = new Intent(MainActivity.this, Amumu.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }
    public void Anivia(View view) {

        Intent intent = new Intent(MainActivity.this, Anivia.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }

    public void Annie(View view) {

        Intent intent = new Intent(MainActivity.this, Annie.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }

    public void Ashe(View view) {

        Intent intent = new Intent(MainActivity.this, Ashe.class);
        startActivity(intent);
        setResult(RESULT_OK, intent);
    }

}


