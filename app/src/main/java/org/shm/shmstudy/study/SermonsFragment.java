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

public class SermonsFragment extends Fragment {
    private static final String TAG = "SermonsFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sermons, container, false);

        return view;
    }
}
