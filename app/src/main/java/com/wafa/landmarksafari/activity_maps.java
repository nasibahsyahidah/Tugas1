package com.wafa.landmarksafari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class activity_maps extends AppCompatActivity {
    ImageButton btnnext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click);

        btnnext1 = (ImageButton) findViewById(R.id.btnMain);
        btnnext1.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, ContinentActivity.class);
            startActivity(i);
        });




    }

}