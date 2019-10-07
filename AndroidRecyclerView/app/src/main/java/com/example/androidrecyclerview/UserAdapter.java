package com.example.androidrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    public List<Users> users;
    //    List<Users> users;
//    String arrUsers[] = {"Vinh,Vi, Tuấn, Huy, Tảo, Trung, Nam, Nhung"};


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_users,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.textView1.setText(users.get(position).Name);
        holder.textView.setText(""+users.get(position).score);
    }

    @Override
    public int getItemCount() {
        if(users.size() == 0){
            return  0;
        }
        else {
            return users.size();
        }

    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        TextView textView1;
        TextView textView;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.user_name);
            textView = itemView.findViewById(R.id.user_score);
        }
    }
}
