package com.wafa.landmarksafari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityIndonesia extends AppCompatActivity {
    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indonesia);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click4);

        next=(ImageView) findViewById(R.id.next);
        next.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this,ActivityBorobuddur.class);
            startActivity(i);
        });

    }
}