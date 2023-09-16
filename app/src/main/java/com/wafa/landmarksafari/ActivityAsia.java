package com.wafa.landmarksafari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityAsia extends AppCompatActivity {
    ImageButton Indonesia, india, china;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click3);

        Indonesia=(ImageButton) findViewById(R.id.indonesia);
        Indonesia.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, ActivityIndonesia.class);
            startActivity(i);
        });

        india=(ImageButton) findViewById(R.id.india);
        india.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, ActivityIndia.class);
            startActivity(i);
        });

        china=(ImageButton) findViewById(R.id.china);
        china.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, ActivityChina.class);
            startActivity(i);
        });
    }
}