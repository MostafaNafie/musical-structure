package com.mostafanafie.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    // Initialize the ArrayList
    private ArrayList<Song> songsList;

    // Constructor
    public RecyclerViewAdapter(Context mContext, ArrayList<Song> songsList) {
        this.mContext = mContext;
        this.songsList = songsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind the songs to the view holder
        Song song = songsList.get(position);
        holder.songNameTextView.setText(song.getSongName());
        holder.artistNameTextView.setText(song.getArtistName());
        holder.albumArtImageView.setImageResource(song.getImageResourceId());

        // Define what happens when an item is clicked
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Send song info to the new intent
                Intent intent = new Intent(v.getContext(), PlayingActivity.class);
                intent.putExtra("songName", song.getSongName());
                intent.putExtra("artistName", song.getArtistName());
                intent.putExtra("imageResourceID", song.getImageResourceId());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // Initialize the views of the list item
        ConstraintLayout parentLayout;
        ImageView albumArtImageView;
        TextView songNameTextView;
        TextView artistNameTextView;

        // Constructor
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            albumArtImageView = itemView.findViewById(R.id.imageView_album_art);
            songNameTextView = itemView.findViewById(R.id.textView_song_name);
            artistNameTextView = itemView.findViewById(R.id.textView_artist_name);
        }
    }


}
