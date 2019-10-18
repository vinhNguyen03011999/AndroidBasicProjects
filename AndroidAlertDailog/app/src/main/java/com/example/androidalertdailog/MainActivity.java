package com.example.androidalertdailog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.imageView = (ImageView) this.findViewById(R.id.imageView);









        findViewById(R.id.ButtonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert("Vinh", "Tran");
            }
        });
    }




    private void showAlert(String title, String message){
        new AlertDialog.Builder(this)
                .setTitle("Android")
                .setMessage("Hollo")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        showImage1();


                    }
                })
                .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        showImage2();
                    }
                }).show();
    }
    private void showImage1() {
        this.imageView.setImageResource(R.drawable.ic_launcher_background);
    }

    private void showImage2() {
        this.imageView.setImageResource(R.drawable.lubo);
    }
}
