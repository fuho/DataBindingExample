package zone.qube.databindingexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import zone.qube.databindingexample.alpha.AlphaFragment;
import zone.qube.databindingexample.beta.BetaFragment;
import zone.qube.databindingexample.beta.UserModel;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return AlphaFragment.newInstance();
            case 1:
                return BetaFragment.newInstance(new UserModel("John", "Smith", "jsmith12@yahoo.com"));
            case 2:
                return BetaFragment.newInstance(new UserModel("Abraham", "Lincoln", null));
            default:
                return AlphaFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Alpha Fragment";
            case 1:
                return "Beta Fragment";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}
