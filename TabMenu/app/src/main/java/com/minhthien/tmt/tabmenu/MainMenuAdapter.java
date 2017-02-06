package com.minhthien.tmt.tabmenu;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11/14/2016.
 */

public class MainMenuAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitle = new ArrayList<>();

    Context context;
    private String tabTitles[] = new String[] { "HomePage","Contact","DeliveryLog" };
    public MainMenuAdapter(FragmentManager fm, Context context) {

        super(fm);
        this.context=context;
        mFragmentList.add(new Homepage());
        mFragmentTitle.add(tabTitles[0]);
        mFragmentList.add(new Contact());
        mFragmentTitle.add(tabTitles[1]);
        mFragmentList.add(new DeliveryLog());
        mFragmentTitle.add(tabTitles[2]);

    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
