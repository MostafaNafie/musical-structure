package com.mostafanafie.musicalstructure;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        // Set the activity title
        setTitle("Now Playing");

        // Display the song info
        TextView songNameTextView = findViewById(R.id.textView_song_name);
        songNameTextView.setText(getIntent().getStringExtra("songName"));

        TextView artistNameTextView = findViewById(R.id.textView_artist_name);
        artistNameTextView.setText(getIntent().getStringExtra("artistName"));

        ImageView albumArtTextView = findViewById(R.id.imageView_album_art);
        albumArtTextView.setImageResource(getIntent().getIntExtra("imageResourceID", 0));
    }
}
