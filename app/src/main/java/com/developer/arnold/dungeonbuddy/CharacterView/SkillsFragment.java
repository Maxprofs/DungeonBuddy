package com.developer.arnold.dungeonbuddy.CharacterView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.arnold.dungeonbuddy.R;

public class SkillsFragment extends Fragment {

    public SkillsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_skills, container, false);

        return rootView;
    }

}