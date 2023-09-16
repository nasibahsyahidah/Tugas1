package com.wafa.landmarksafari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ContinentActivity extends AppCompatActivity {

    ImageButton btnasia, btnafrica, btnNorthAmerica, btnSouthAmerica, btneurope, btnAustralia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continent);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click2);

        btnasia= (ImageButton) findViewById(R.id.asia);
        btnasia.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, ActivityAsia.class);
            startActivity(i);
        });

        btneurope= (ImageButton) findViewById(R.id.europe);
        btneurope.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, activity_europe.class);
            startActivity(i);
        });

        btnafrica= (ImageButton) findViewById(R.id.africa);
        btnafrica.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, ActivityAfrica.class);
            startActivity(i);
        });

        btnNorthAmerica=(ImageButton) findViewById(R.id.northamerica);
        btnNorthAmerica.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, MainNorthAmerica.class);
            startActivity(i);
        });

        btnSouthAmerica=(ImageButton) findViewById(R.id.southamerica);
        btnSouthAmerica.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this,MainSouthAmerica.class);
            startActivity(i);
        });

        btnAustralia=(ImageButton) findViewById(R.id.australia);
        btnAustralia.setOnClickListener(view -> {
            mediaPlayer.start();
            Intent i = new Intent(this, ActivityAustralia.class);
            startActivity(i);
        });

    }

}