package org.shm.shmstudy.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import org.shm.shmstudy.home.HomeActivity;
import org.shm.shmstudy.inspiration.InspirationActivity;
import org.shm.shmstudy.library.LibraryActivity;
import org.shm.shmstudy.me.MeActivity;
import org.shm.shmstudy.R;
import org.shm.shmstudy.study.StudiesActivity;

/**
 * Created by user on 7/17/2017.
 */

public class BottomNavViewHelper {

    private static final String TAG = "BottomNavViewHelper";

    public static void setupBottomNavigationView (BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setIconSize(24f, 24f);
        bottomNavigationViewEx.setTextSize(14f);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_study:
                        Intent intent1 = new Intent (context, StudiesActivity.class); // ACTIVITY_NUMBER = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_inspiration:
                        Intent intent2 = new Intent (context, InspirationActivity.class); // ACTIVITY_NUMBER = 1
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_home:
                        Intent intent3 = new Intent (context, HomeActivity.class); // ACTIVITY_NUMBER = 2
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_me:
                        Intent intent4 = new Intent (context, MeActivity.class); // ACTIVITY_NUMBER = 3
                        context.startActivity(intent4);
                        break;

                    case R.id.ic_library:
                        Intent intent5 = new Intent (context, LibraryActivity.class); // ACTIVITY_NUMBER = 4
                        context.startActivity(intent5);
                        break;
                }

                return false;
            }
        });

    }

}
