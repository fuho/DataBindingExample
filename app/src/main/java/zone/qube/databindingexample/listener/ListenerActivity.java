package zone.qube.databindingexample.listener;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import zone.qube.databindingexample.R;
import zone.qube.databindingexample.SectionsPagerAdapter;
import zone.qube.databindingexample.SwitchActivityFragment;
import zone.qube.databindingexample.simple.BasicsActivity;

public class ListenerActivity extends AppCompatActivity {

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
                "Buttons and ..",
                ButtonListenerFragment.newInstance()
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                ".. other widgets",
                OtherWidgetsListenerFragment.newInstance()
        ));
        mSectionsPagerAdapter.screens.add(new SectionsPagerAdapter.Screen(
                "Next",
                SwitchActivityFragment.newInstance(BasicsActivity.class)
        ));


        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


}
