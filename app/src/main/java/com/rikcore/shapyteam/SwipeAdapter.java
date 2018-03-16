package com.rikcore.shapyteam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by rikcore on 13/03/2018.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {

    ArrayList<Shaper> shapersList;

    public SwipeAdapter (FragmentManager fm, ArrayList<Shaper> shapersList){
        super(fm);
        this.shapersList = shapersList;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment pageFragement = new Page();
        Bundle bundle = new Bundle();
        bundle.putInt("pageNumber", position);
        bundle.putParcelableArrayList("shapersList", shapersList);
        pageFragement.setArguments(bundle);
        return pageFragement;
    }

    @Override
    public int getCount() {
        return shapersList.size();
    }
}
