package com.example.button2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bt1 = findViewById(R.id.setbutton) as Button
        bt1.setText("submit report")
    }

    fun buttonclick(view: View) {
        var bt2 = findViewById(R.id.setbutton) as Button
        bt2.setText("Cancal")
    }
}
