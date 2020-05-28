package com.example.android.coloradotourguide;


public class Place {

    private int mNameId;

    private int mLocationId;

    private int mCostId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(int nameId, int locationId, int costId) {
        mNameId = nameId;
        mLocationId = locationId;
        mCostId = costId;
    }

    public Place(int nameId, int locationId, int costId,
                int imageResourceId) {
        mNameId = nameId;
        mLocationId = locationId;
        mCostId = costId;
        mImageResourceId = imageResourceId;
    }

    public int getNameId() {
        return mNameId;
    }

    public int getLocationId() {
        return mLocationId;
    }

    public int getCostId() {
        return mCostId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}