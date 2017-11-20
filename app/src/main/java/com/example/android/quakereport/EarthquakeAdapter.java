package com.example.android.quakereport;

import android.content.Context;
import android.renderscript.Sampler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Create a custom constructor
     *
     * @param context     is the current context.
     * @param earthquakes List of Earthquake objects to display in the list
     */
    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Provide a view for the AdapterView for list_item
     *
     * @param position    The position of the list item to be displayed.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view can be reused, else create a new view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        // Get the object located in that position in the list.
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView for the magnitude from layout
        TextView earthquakeMagnitude = (TextView) listItemView.findViewById(R.id.earthquake_magnitude);

        // Set the magnitude TextView with current earthquake magnitude
        earthquakeMagnitude.setText(String.valueOf(currentEarthquake.getMagnitude()));

        // Find the TextView for the location from layout
        TextView earthquakeLocation = (TextView) listItemView.findViewById(R.id.earthquake_location);

        // Set the location TextView with current earthquake location
        earthquakeLocation.setText(currentEarthquake.getLocation());

        // Find the TextView for the date from layout
        TextView earthquakeDate = (TextView) listItemView.findViewById(R.id.earthquake_date);

        // Set the date TextView with current earthquake date
        earthquakeDate.setText(String.valueOf(currentEarthquake.getDate()));

        // Return listItem layout
        return listItemView;
    }
}
