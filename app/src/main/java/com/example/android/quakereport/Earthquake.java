package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private double mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Date of the earthquake
    private long mTimeInMilliSeconds;

    /**
     * Create new object of Earthquake
     *
     * @param magnitude          is magnitude of the earthquake
     * @param location           is location of the earthquake
     * @param timeInMilliSeconds is date of the earthquake
     */

    public Earthquake(double magnitude, String location, long timeInMilliSeconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliSeconds = timeInMilliSeconds;
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
    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
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
    public void setTimeInMilliSeconds(long timeInMilliSeconds) {
        mTimeInMilliSeconds = timeInMilliSeconds;
    }

}
