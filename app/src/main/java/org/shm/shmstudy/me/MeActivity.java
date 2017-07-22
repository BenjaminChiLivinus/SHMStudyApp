package org.shm.shmstudy.me;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import org.shm.shmstudy.R;
import org.shm.shmstudy.utils.BottomNavViewHelper;

public class MeActivity extends AppCompatActivity {
    private static final String TAG = "MeActivity";
    private static final int ACTIVITY_NUMBER = 3;

    private Context mContext = MeActivity.this;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        Log.d(TAG, "onCreate: Started.");

        toolbar = (Toolbar) findViewById(R.id.layoutTopToolbar);
        setSupportActionBar(toolbar);

        setupBottomNavigationView();
        
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
