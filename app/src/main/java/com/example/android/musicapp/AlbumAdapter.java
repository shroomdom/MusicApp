package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Context context, ArrayList<Album> albumsList) {
        super(context, 0, albumsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.albums_list, parent, false);
        }

        // Get the Album object located at this position in the list
        Album currentAlbum = getItem(position);

        /**
         *  Get album art, album name, and artist name data and set this text
         */
        ImageView albumImageView = (ImageView) listItemView.findViewById(R.id.mp_albumArt_image_view);
        albumImageView.setImageResource(currentAlbum.getAlbumArt());

        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.mp_albumName_text_view);
        albumNameTextView.setText(currentAlbum.getAlbumName());

        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.mp_artistName_text_view);
        artistNameTextView.setText(currentAlbum.getArtistName());

        return listItemView;
    }
}
