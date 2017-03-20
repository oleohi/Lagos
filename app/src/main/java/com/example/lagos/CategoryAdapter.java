package com.example.lagos;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by USER on 24/02/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MusicFragment();
        } else if (position == 1){
            return new ParkFragment();
        } else if(position == 2) {
            return new MonumentFragment();
        } else{
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.music_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.parks_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.monuments_fragment);
        } else {
            return mContext.getString(R.string.restaurants_fragment);
        }
    }
}
