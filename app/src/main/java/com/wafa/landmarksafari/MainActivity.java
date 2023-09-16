package com.wafa.landmarksafari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btnMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click);

        btnMain = (ImageView) findViewById(R.id.btnMain);
        btnMain.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, activity_maps.class);
            startActivity(i);
        });

    }

}
