package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private double mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Date of the earthquake
    private long mDate;

    /**
     * Create new object of Earthquake
     *
     * @param magnitude is magnitude of the earthquake
     * @param location  is location of the earthquake
     * @param date      is date of the earthquake
     */

    public Earthquake(double magnitude, String location, long date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    // Get the magnitude of the earthquake
    public double getMagnitude() {
        return mMagnitude;
    }

    // Get the location of the earthquake
    public String getLocation() {
        return mLocation;
    }

    // Get the date of the earthquake
    public long getDate() {
        return mDate;
    }

    // Set the magnitude of the earthquake
    public void setMagnitude(double magnitude) {
        mMagnitude = magnitude;
    }

    // Set the location of the earthquake
    public void setLocation(String location) {
        mLocation = location;
    }

    // Set the date of the earthquake
    public void setDate(long date) {
        mDate = date;
    }

}
