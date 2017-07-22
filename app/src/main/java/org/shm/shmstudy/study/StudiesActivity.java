package org.shm.shmstudy.study;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import org.shm.shmstudy.R;
import org.shm.shmstudy.utils.BottomNavViewHelper;

public class StudiesActivity extends AppCompatActivity {
    private static final String TAG = "StudiesActivity";
    private static final int ACTIVITY_NUMBER = 0;

    private Context mContext = StudiesActivity.this;


    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studies);
        Log.d(TAG, "onCreate: Started.");

        setupBottomNavigationView();
        setupViewPager();
        setupTabCustomView();
    }

    private void setupTabCustomView () {

        int[] tabIcons = {R.drawable.ic_tuesday, R.drawable.ic_sunday, R.drawable.ic_sermons};

        for (int i=0; i < tabLayout.getTabCount(); i++) {

            ViewGroup parent = (ViewGroup) findViewById(R.id.custom_top_tab_container);
            View view = LayoutInflater.from(this).inflate(R.layout.layout_studies_custom_top_tab, parent, true);
            ImageView studiesTabIcon = view.findViewById(R.id.studies_icon);

            tabLayout.getTabAt(i).setCustomView(view);
            studiesTabIcon.setImageResource(tabIcons[i]);

        }

    }

    /**
     * Responsible for adding the 3 tabs: CellStudies, SundayStudies and Sermons
     */
    private void setupViewPager (){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TuesdayStudiesFragment()); //index 0
        adapter.addFragment(new SundayStudiesFragment()); //index 1
        adapter.addFragment(new SermonsFragment()); //index 2
        ViewPager viewPager = (ViewPager) findViewById(R.id.study_center_container);
        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.layout_study_top_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_tuesday).setText(R.string.tuesday_studies);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_sunday).setText(R.string.sunday_studies);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_sermons).setText(R.string.sermons);

    }

    /**
     * BottomNavigationView setup
     */
    private void setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottom_navigation);
        BottomNavViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUMBER);
        menuItem.setChecked(true);
    }
}
