package zone.qube.databindingexample;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Screen> screens = new ArrayList<>();


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        return screens.get(position).fragment;
    }

    @Override
    public int getCount() {
        return screens.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return screens.get(position).name;
    }

    public static class Screen {
        @NonNull private final String name;
        @NonNull private final Fragment fragment;

        public Screen(@NonNull final String name, @NonNull Fragment fragment) {
            this.name = name;
            this.fragment = fragment;
        }
    }
}
