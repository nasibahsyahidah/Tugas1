package com.wafa.landmarksafari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class activity_indo2 extends AppCompatActivity {
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indo2);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click4);

        next=(ImageButton) findViewById(R.id.btnMain);
        next.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this,activity_indo3.class);
            startActivity(i);
        });

    }
}