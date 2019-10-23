package com.example.udacityapplicationmiwok;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;


    CategoryFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MainActivityFragment();
        } else if (position == 1) {
            return new NumbersActivityFragment();
        } else if (position == 2) {
            return new FamilyActivityFragment();
        } else if (position == 3) {
            return new ColorsActivityFragment();
        } else {
            return new PhrasesActivityFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 1) {
            return context.getString(R.string.category_numbers);
        } else if (position == 0) {
            return context.getString(R.string.main_view);
        } else if (position == 2) {
            return context.getString(R.string.category_family);
        } else if (position == 3) {
            return context.getString(R.string.category_colors);
        } else {
            return context.getString(R.string.category_phrases);
        }
    }

}


