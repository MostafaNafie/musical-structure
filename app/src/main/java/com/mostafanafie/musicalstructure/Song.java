package com.mostafanafie.musicalstructure;

public class Song {

    private String mSongName;
    private String mArtistName;
    private int mImageResourceId;

    // Constructor
    public Song(String songName, String artistName, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    // Get the song name
    public String getSongName() {
        return mSongName;
    }

    // Get the artist name
    public String getArtistName() {
        return mArtistName;
    }

    // Get the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
