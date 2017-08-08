package zone.qube.databindingexample.user;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import zone.qube.databindingexample.R;
import zone.qube.databindingexample.SectionsPagerAdapter;
import zone.qube.databindingexample.SwitchActivityFragment;
import zone.qube.databindingexample.listener.ListenerActivity;

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
                UserFragment.newInstance(new UserModel("John", "Smith", "jsmith12@yahoo.com"))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Null email",
                UserFragment.newInstance(new UserModel("Abraham", "Lincoln", null))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Empty email",
                EmailFragment.newInstance(new UserModel("Userwith", "EmptyEmail", ""))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Valid email",
                EmailFragment.newInstance(new UserModel("Didg", "Eridoo", "didg@eridoo.com"))
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Next",
                SwitchActivityFragment.newInstance(ListenerActivity.class)
        ));


        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


}
