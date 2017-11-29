package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private double mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Date of the earthquake
    private long mTimeInMilliSeconds;

    // Website URL for the earthquake details
    private String mURL;

    /**
     * Create new object of Earthquake
     *
     * @param magnitude          is magnitude of the earthquake
     * @param location           is location of the earthquake
     * @param timeInMilliSeconds is date of the earthquake
     * @param url                is URL for the earthquake details
     */

    public Earthquake(double magnitude, String location, long timeInMilliSeconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliSeconds = timeInMilliSeconds;
        mURL = url;
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

    // Get the URL of the earthquake
    public String getURL() {
        return mURL;
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

    public void setURL(String url) {
        mURL = url;
    }

}
