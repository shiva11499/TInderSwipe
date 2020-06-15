package com.gshivansh37.wallpaperswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.gshivansh37.wallpaperswipe.models.User;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.Duration;
import com.yuyakaido.android.cardstackview.RewindAnimationSetting;
import com.yuyakaido.android.cardstackview.StackFrom;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CardStackView stackView = findViewById(R.id.card_stack_view);

        // Configuring Layout Manager
        CardStackLayoutManager layoutManager = new CardStackLayoutManager(this);
        layoutManager.setStackFrom(StackFrom.Top);
        layoutManager.setVisibleCount(3);
        RewindAnimationSetting setting = new RewindAnimationSetting.Builder()
                .setDirection(Direction.Left)
                .setDuration(Duration.Slow.duration)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .build();
        layoutManager.setRewindAnimationSetting(setting);

        stackView.setLayoutManager(layoutManager);
        stackView.setAdapter(new CardAdapter(initData()));

        findViewById(R.id.action_bolt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stackView.rewind();
            }
        });
    }

    private List<User> initData() {
        List<User> users = new ArrayList<>();
        users.add(new User("Renae Will", "Surgeon", "https://media.idownloadblog.com/wp-content/uploads/2017/01/vellum-wallpaper-1.jpg"));
        users.add(new User("Clark Gilbert", "Song writer", "https://media.idownloadblog.com/wp-content/uploads/2017/01/vellum-wallpaper-4.jpg"));
        users.add(new User("Paulina Eva", "Councillor", "https://uploads.disquscdn.com/images/ba43d6a0587e027239ed64723c7cb7920e5b63e76e508edc10432434761a0db9.jpg"));
        users.add(new User("Malcolm Jinny", "Costume designer", "https://media.idownloadblog.com/wp-content/uploads/2017/01/vellum-wallpaper-3.jpg"));
        users.add(new User("Racquel Tamera", "Dietician", "https://media.idownloadblog.com/wp-content/uploads/2017/01/vellum-wallpaper-2.jpg"));
        return users;
    }
}