package com.example.hometaskandroid_03_04_listofpeople;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private final TextView textName;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textName=itemView.findViewById(R.id.textView);
    }

    public void bind(String name){
        textName.setText(name);
    }

}

