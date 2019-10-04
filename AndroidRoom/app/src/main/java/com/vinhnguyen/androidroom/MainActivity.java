package com.vinhnguyen.androidroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static androidx.room.RoomMasterTable.TABLE_NAME;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-name").build();
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                User user1 = new User();
                user1.uid = 3;
                user1.firstName = "Vinh";
                db.userDao().insertAll(user1);
                return null;
            }
        }.execute();
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUsers();
            }
        });

    }

    public void getUsers() {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                final List<User> users = db.userDao().getAll();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        Toast.makeText(MainActivity.this, "size " + users.size(), Toast.LENGTH_SHORT).show();
                        ((TextView)findViewById(R.id.listInfor)).setText(""+users.size());
                        ((TextView)findViewById(R.id.listInfor)).setText(""+users.toString());
                    }
                });

                return null;
            }
        }.execute();
    }

}
