package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 *  This is the root page that sets onClickListeners to my the list of album items and opens other activities.
 */
public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.activity_main_list_view);

        ArrayList<Album> albumList = new ArrayList<Album>();
        albumList.add(new Album(R.drawable.album_cover, "Album Name One", "Artist Name One"));
        albumList.add(new Album(R.drawable.album_cover, "Album Name Two", "Artist Name Two"));
        albumList.add(new Album(R.drawable.album_cover, "Album Name Three", "Artist Name Three"));

        AlbumAdapter adapter = new AlbumAdapter(this, albumList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), AlbumOne.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), AlbumTwo.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), AlbumThree.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });
    }
}