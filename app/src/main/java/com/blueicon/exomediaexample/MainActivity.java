package com.blueicon.exomediaexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.ui.widget.VideoView;

public class MainActivity extends AppCompatActivity implements OnPreparedListener {
    private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupVideoView();
    }

    private void setupVideoView() {
        // Make sure to use the correct VideoView import
        videoView = (VideoView)findViewById(R.id.video_view);
        videoView.setOnPreparedListener(this);

        //For now we just picked an arbitrary item to play
        videoView.setVideoURI(Uri.parse("http://serveraplicaciones.cloudapp.net:85/DistritoSonataVideo/torreNegra.mp4"));
    }

    @Override
    public void onPrepared() {
        videoView.start();


    }
}
