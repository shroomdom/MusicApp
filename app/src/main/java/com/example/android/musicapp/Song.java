package com.example.android.musicapp;

public class Song {
    /** Song name */
    private String mSongName;
    /** Artist name */
    private String mArtistName;

    /** Create a new Song object */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Get the song name.
     */
    public String getSongName() {
        return mSongName;
    }
    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return mArtistName;
    }
}
