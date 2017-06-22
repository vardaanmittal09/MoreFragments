package com.example.android.morefragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 6/22/2017.
 */

public class MyFragementPagerAdapter extends FragmentPagerAdapter {

    private int fragCount = 0;
    List<Fragment> fragmentList;

    public MyFragementPagerAdapter(FragmentManager fm, int count) {
        super(fm);
        this.fragCount = count;
        this.fragmentList = new ArrayList<>(count);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        Log.d("FRAG","getItem :" + fragmentList.size());
        try {
            fragment=fragmentList.get(position);
        }
        catch (IndexOutOfBoundsException ioobe)
        {
            fragment=BlankFragment.newInstance(
                    "Fragment : " + position,
                    "Yet Another Fragment"
            );
            fragmentList.add(position,fragment);
        }
        if(fragment== null) {
            fragment = BlankFragment.newInstance(
                    "Fragment : " + position,
                    "Yet Another Fragment"
            );
            fragmentList.add(position, fragment);
        }
            return fragment;
    }
    @Override
    public int getCount() {
        return fragCount;
    }
}
