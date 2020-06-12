package com.gshivansh37.wallpaperswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yuyakaido.android.cardstackview.CardStackView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardStackView stackView = findViewById(R.id.card_stack_view);
        stackView.setAdapter(new CardAdapter());
    }
}