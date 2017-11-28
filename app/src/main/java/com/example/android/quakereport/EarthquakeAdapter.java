package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";

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
        earthquakeMagnitude.setText(formatMagnitude(currentEarthquake.getMagnitude()));

        // Find TextView reference to the location offset in the layout
        TextView earthquakeLocationOffset = (TextView) listItemView.findViewById(R.id.earthquake_location_offset);

        // Find the TextView for the location from layout
        TextView earthquakeLocationPrimary = (TextView) listItemView.findViewById(R.id.earthquake_location_primary);

        String originalLocation = currentEarthquake.getLocation();
        String locationOffset, primaryLocation;
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] locationParts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = locationParts[0] + LOCATION_SEPARATOR;
            primaryLocation = locationParts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        // Set the locationOffset TextView with the current location offset
        earthquakeLocationOffset.setText(locationOffset);

        // Set the locationPrimary TextView with current earthquake primary location
        earthquakeLocationPrimary.setText(primaryLocation);

        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliSeconds());

        // Find the TextView for the date from layout
        TextView earthquakeDate = (TextView) listItemView.findViewById(R.id.earthquake_date);

        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);

        // Set the date TextView with current earthquake date
        earthquakeDate.setText(formattedDate);

        // Find the TextView for the time from layout
        TextView earthquakeTime = (TextView) listItemView.findViewById(R.id.earthquake_time);

        // Format the time string(i.e. "12:00 AM")
        String formattedTime = formatTime(dateObject);

        // Set the time TextView with current earthquake time
        earthquakeTime.setText(formattedTime);

        // Return listItem layout
        return listItemView;
    }

    /**
     * Return the formatted magnitude string (i.e. "0.00") from decimal magnitude
     */
    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }


    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy", Locale.getDefault());
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a", Locale.getDefault());
        return timeFormat.format(dateObject);
    }
}