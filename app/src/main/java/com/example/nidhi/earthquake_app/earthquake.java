package com.example.nidhi.earthquake_app;

public class earthquake {
    private String magnitude;
    private String location;
    private String date;
    private long mTimeInMilliseconds;
    private String url;

    public earthquake(String mag, String loc, long timeInMilliseconds,String murl) {
        magnitude = mag;
        location = loc;
        mTimeInMilliseconds = timeInMilliseconds;
        url = murl;
    }

    public String getMagnitude() {
        return magnitude;
    }
    public Double getMaginDouble(){
        Double d = Double.parseDouble(magnitude);
        return d;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl(){
        return url;
    }
}