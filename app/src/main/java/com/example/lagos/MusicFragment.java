package com.example.lagos;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {


    public MusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Muson Center", R.drawable.muson_logo));
        attractions.add(new Attraction("Freedom Park", R.drawable.freedom_park_logo));
        attractions.add(new Attraction("Jazzhole", R.drawable.jazzhole_logo));
        attractions.add(new Attraction("Afrika Shrine", R.drawable.afrika_shrine_logo));
        attractions.add(new Attraction("Terra Kulture", R.drawable.terrakulture_logo));

        // Create an {@link AttractionAdapter}, whose data source is a list of
        // {@link AttractionAdapter}s. The adapter knows how to create list item views for each item
        // in the list.
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), 0, attractions);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(getActivity(), MusonCenterActivity.class);
                    startActivity(i);
                }else if (position == 1){
                    Intent i = new Intent(getActivity(), FreedomParkActivity.class);
                    startActivity(i);
                }else if (position == 2){
                    Intent i = new Intent(getActivity(), JazzholeActivity.class);
                    startActivity(i);
                }else if (position == 3){
                    Intent i = new Intent(getActivity(), AfrikaShrineActivity.class);
                    startActivity(i);
                }else{
                    Intent i = new Intent(getActivity(), TerraKultureActivity.class);
                    startActivity(i);
                }
            }
        });

        return rootView;
    }

}
