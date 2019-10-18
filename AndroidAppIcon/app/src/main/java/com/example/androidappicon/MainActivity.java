package com.example.androidappicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
// bước 1: Chọn mipmap -> Right click
// bước 2: Click Image Asset
// bước 3: Tại ô path->chọn ảnh
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
