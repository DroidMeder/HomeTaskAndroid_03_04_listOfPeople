package com.example.hometaskandroid_03_04_listofpeople;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class Adaptor extends RecyclerView.Adapter<ViewHolder> {

    List<String> names;

    public Adaptor(List<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.bind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}


