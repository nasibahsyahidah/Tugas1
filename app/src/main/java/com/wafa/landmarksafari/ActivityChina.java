package com.wafa.landmarksafari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityChina extends AppCompatActivity {
    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        next=findViewById(R.id.next);
        next.setOnClickListener(view -> {
            Intent i = new Intent(this,ActivityWall.class);
            startActivity(i);
        });
    }
}