package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Users> users;

    RecyclerView recyclerViewUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewUser = findViewById(R.id.recycler_user);
        recyclerViewUser.setLayoutManager(new LinearLayoutManager(this));

        final UserAdapter userAdapter = new UserAdapter();
        recyclerViewUser.setAdapter(userAdapter);

        final Users user1 = new Users("Vinh",8);
        final Users user2 = new Users("Tuân",9);
        final Users user3 = new Users("Thanh",5);

        users = new ArrayList<Users>(){{
        add(user1);
        add(user2);
        add(user3);

        userAdapter.users = users;

        findViewById(R.id.add_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"click", Toast.LENGTH_SHORT);

                users.add(new Users("Mai",7));
                userAdapter.notifyDataSetChanged();
            }
        });
        }};
    }
}
