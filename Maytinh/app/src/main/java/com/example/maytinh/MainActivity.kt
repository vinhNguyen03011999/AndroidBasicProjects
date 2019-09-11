package com.example.maytinh

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textview = findViewById(R.id.textresult) as TextView
        textview.setText("change kotlin")
        textview.setTextColor(Color.parseColor("#ff1493"))
        var tview1 = findViewById(R.id)
    }
}
