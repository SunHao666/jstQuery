package com.hao.jstquery.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class KCInfoAdapter extends FragmentStatePagerAdapter {

    public List<Fragment> data;
    public KCInfoAdapter(@NonNull FragmentManager fm, List<Fragment> data) {
        super(fm);
        this.data = data;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
