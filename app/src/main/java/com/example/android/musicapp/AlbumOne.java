package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class AlbumOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_page);

        // Create a list of song info
        ArrayList<Song> albumSongs = new ArrayList<Song>();
        albumSongs.add(new Song("Song Name One","Artist Name One"));
        albumSongs.add(new Song("Song Name Two","Artist Name One"));
        albumSongs.add(new Song("Song Name Three","Artist Name One"));

        // Create a song adapter whose data source is a list of song info
        SongAdapter adapter = new SongAdapter(this, albumSongs);

        ListView listView = (ListView) findViewById(R.id.song_list_view);

        // Make the listView use the SongAdapter we created above so that the listView
        // will display list items for all of the song info in the list
        listView.setAdapter(adapter);

        TextView textView = (TextView) findViewById(R.id.album_name_text_view);
        String albumName = "Album Name One";
        textView.setText(albumName);

        TextView artistNameTextView = (TextView) findViewById(R.id.artist_name_text_view);
        String artistName = "Artist Name One";
        artistNameTextView.setText(artistName);
    }
}
