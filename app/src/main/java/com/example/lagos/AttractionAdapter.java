package com.example.lagos;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 27/02/2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(FragmentActivity fragmentActivity, int i, ArrayList<Attraction> attractions) {
        super(fragmentActivity, i, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        //Find the ImageView in the list_item.xml layout with the ID ivImage and set on the ImageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.ivImage);
        imageView.setImageResource(currentAttraction.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);

        // Find the TextView in the list_item.xml layout with the ID, attraction
        TextView attractionText = (TextView) listItemView.findViewById(R.id.attraction);
        //Get the attraction name and set it on the attraction TextView
        attractionText.setText(currentAttraction.getName());

        //View listContainer = listItemView.findViewById(R.id.listContainer);
        //textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 1 ImageView and 1 TextView) so that it can be shown in the ListView
        return listItemView;
    }
}
