package com.example.tab_layout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

private int tabnum;
    public PageAdapter(@NonNull FragmentManager fm, int behavior,int tabs) {
        super(fm, behavior);
        this.tabnum=tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new first();
            case 1:return new second();
            case 2:return new third();
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return tabnum;
    }
}
