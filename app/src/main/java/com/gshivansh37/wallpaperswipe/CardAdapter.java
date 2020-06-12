package com.gshivansh37.wallpaperswipe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardView> {

    @NonNull
    @Override
    public CardView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CardView(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    static class CardView extends RecyclerView.ViewHolder {
        public CardView(@NonNull View itemView) {
            super(itemView);
        }
    }
}
