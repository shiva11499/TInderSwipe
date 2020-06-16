package com.gshivansh37.wallpaperswipe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gshivansh37.wallpaperswipe.models.User;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardView> {
    private List<User> users;

    public CardAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public CardView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CardView(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardView holder, int position) {
        holder.userNameTextView.setText(users.get(position).getName());
        holder.userInfoTextView.setText(users.get(position).getInfo());
        Glide.with(holder.imageView)
                .load(users.get(position).getImageUrl())
                .placeholder(R.drawable.background_gradient)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return users == null ? 0 : users.size();
    }

    static class CardView extends RecyclerView.ViewHolder {
        private final ImageView imageView;
        private final TextView userNameTextView;
        private final TextView userInfoTextView;

        public CardView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.user_image);
            userNameTextView = itemView.findViewById(R.id.user_name);
            userInfoTextView = itemView.findViewById(R.id.user_info);
        }
    }
}
