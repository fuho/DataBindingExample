package zone.qube.databindingexample;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import zone.qube.databindingexample.alpha.AlphaFragment;
import zone.qube.databindingexample.beta.BetaFragment;
import zone.qube.databindingexample.beta.UserModel;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Screen> mScreens = new ArrayList<>();

    {
        mScreens.add(new Screen(
                "Simple",
                AlphaFragment.newInstance()
        ));
        mScreens.add(new Screen(
                "Usr A",
                BetaFragment.newInstance(new UserModel("John", "Smith", "jsmith12@yahoo.com"))
        ));
        mScreens.add(new Screen(
                "Usr B",
                BetaFragment.newInstance(new UserModel("Abraham", "Lincoln", null))
        ));

    }

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mScreens.get(position).fragment;
    }

    @Override
    public int getCount() {
        return mScreens.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mScreens.get(position).name;
    }

    private class Screen {
        @NonNull private final String name;
        @NonNull private final Fragment fragment;

        public Screen(@NonNull final String name, @NonNull Fragment fragment) {
            this.name = name;
            this.fragment = fragment;
        }
    }
}
