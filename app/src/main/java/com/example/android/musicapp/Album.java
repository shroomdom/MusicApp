package com.example.android.musicapp;

public class Album {
    private int mAlbumArt;
    private String mAlbumName;
    private String mArtistName;

    /**
     * Create a new Album object
     */
    public Album(int albumArt, String albumName, String artistName) {
        mAlbumArt = albumArt;
        mAlbumName = albumName;
        mArtistName = artistName;
    }

    /**
     * Get the album art name.
     */
    public int getAlbumArt() {
        return mAlbumArt;
    }

    /**
     * Get the album name.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return mArtistName;
    }

}
