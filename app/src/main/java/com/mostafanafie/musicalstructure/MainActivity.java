package com.mostafanafie.musicalstructure;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Initialize the ArrayList
    private ArrayList<Song> mSongsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup the ArrayList
        setupArrayList();

        // Setup the recycler view
        setupRecyclerView();
    }

    private void setupArrayList() {
        // Populate the ArrayList with songs
        mSongsList.add(new Song("Old Town Road", "Lil Nas X Featuring Billy Ray Cyrus", R.drawable.old));
        mSongsList.add(new Song("Bad Guy", "Billie Eilish", R.drawable.bad));
        mSongsList.add(new Song("Talk", "Khalid", R.drawable.talk));
        mSongsList.add(new Song("I Don't Care", "Ed Sheeran & Justin Bieber", R.drawable.dont));
        mSongsList.add(new Song("Senorita", "Shawn Mendes & Camila Cabello", R.drawable.senorita));
        mSongsList.add(new Song("Truth Hurts", "Lizzo", R.drawable.truth));
        mSongsList.add(new Song("Sucker", "Jonas Brothers", R.drawable.sucker));
        mSongsList.add(new Song("Sunflower (Spider-Man: Into The Spider-Verse)", "Post Malone & Swae Lee", R.drawable.sunflower));
        mSongsList.add(new Song("No Guidance", "Chris Brown Featuring Drake", R.drawable.guidance));
        mSongsList.add(new Song("Suge", "DaBaby", R.drawable.suge));
    }

    private void setupRecyclerView() {
        // Initialize the recycler view
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        // Initialize the adapter, and pass the ArrayList to it
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mSongsList);
        // Attach the adapter to the recycler view
        recyclerView.setAdapter(adapter);
        // Attach the layout manager to the recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Add divider to the recycler view
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
