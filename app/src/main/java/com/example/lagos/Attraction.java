package com.example.lagos;

/**
 * Created by USER on 24/02/2017.
 */

public class Attraction {
    private String mName;
    private int mImageResourceId;
    private String location;

    public Attraction(String name, int imageId) {
        mName = name;
        mImageResourceId = imageId;
    }

    public Attraction(String location) {
        this.location = location;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageId) {
        mImageResourceId = imageId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
