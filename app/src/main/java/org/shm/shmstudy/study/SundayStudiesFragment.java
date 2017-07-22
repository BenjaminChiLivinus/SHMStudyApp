package org.shm.shmstudy.study;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.shm.shmstudy.R;

/**
 * Created by user on 7/21/2017.
 */

public class SundayStudiesFragment extends Fragment {
    private static final String TAG = "SundayStudiesFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sunday_studies, container, false);

        return view;
    }
}
