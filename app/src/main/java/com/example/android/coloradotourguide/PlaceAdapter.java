package com.example.android.coloradotourguide;

import android.app.Activity;
import androidx.core.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView imageImageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentPlace.hasImage()) {
            imageImageView.setImageResource(currentPlace.getImageResourceId());
            imageImageView.setVisibility(View.VISIBLE);
        } else {
            imageImageView.setVisibility(View.GONE);
        }

        //places details go here
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getNameId());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentPlace.getLocationId());

        TextView costTextView = (TextView) listItemView.findViewById(R.id.cost_text_view);
        costTextView.setText(currentPlace.getCostId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
