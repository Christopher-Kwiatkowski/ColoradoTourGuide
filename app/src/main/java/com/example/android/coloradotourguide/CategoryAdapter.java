package com.example.android.coloradotourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class CategoryAdapter extends FragmentStateAdapter {

    public CategoryAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new MountainFragment();
        } else if (position == 1) {
            return new LakeFragment();
        } else if (position == 2) {
            return new SkiFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}