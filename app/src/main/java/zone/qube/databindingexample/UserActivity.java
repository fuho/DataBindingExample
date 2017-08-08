package zone.qube.databindingexample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import zone.qube.databindingexample.user.EmailUserFrag;
import zone.qube.databindingexample.user.UserFrag;
import zone.qube.databindingexample.user.UserModel;

public class UserActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
                mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                        "User",
                        UserFrag.newInstance(new UserModel("John", "Smith", "jsmith12@yahoo.com"))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Null email",
                UserFrag.newInstance(new UserModel("Abraham", "Lincoln", null))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Empty email",
                EmailUserFrag.newInstance(new UserModel("Userwith", "EmptyEmail", ""))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Valid email",
                EmailUserFrag.newInstance(new UserModel("Didg", "Eridoo", "didg@eridoo.com"))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Next",
                SwitchActivityFragment.newInstance(MainActivity.class)
        ));


        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


}
