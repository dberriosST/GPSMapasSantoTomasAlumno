package com.example.gpsmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private VideoView videito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Button btn_main = findViewById(R.id.btn_main);

        videito = findViewById(R.id.videoView);

        String videoUrl ="https://drive.google.com/file/d/1HRwfTfVRiR1r4OjzhVQoUjYFMy-V33T8/view?usp=share_link";

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videito);
        videito.setMediaController(mediaController);

        videito.setVideoURI(Uri.parse(videoUrl));

        videito.start();

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}