package com.example.gpsmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView MiVideito = findViewById(R.id.videoView);
    }
}