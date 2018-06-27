package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> albumSongs) {
        super(context, 0, albumSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_page, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        TextView songsTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        songsTextView.setText(currentSong.getSongName());

        TextView singerTextView = (TextView) listItemView.findViewById(R.id.singer_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        singerTextView.setText(currentSong.getArtistName());


        return listItemView;
    }
}
