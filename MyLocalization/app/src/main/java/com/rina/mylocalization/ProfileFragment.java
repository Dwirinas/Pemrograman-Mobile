package com.rina.mylocalization;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_profile, null);
        // harus sebelum return root
        TextView tvName = root.findViewById(R.id.tvName);
        TextView tvAddress = root.findViewById(R.id.tvAddress);
        TextView tvHobby = root.findViewById(R.id.tvHobby);
        TextView tvQuotes = root.findViewById(R.id.tvQuotes);
        tvName.setText(getResources().getString(R.string.name));
        tvAddress.setText(getResources().getString(R.string.address));
        tvHobby.setText(getResources().getString(R.string.hobby));
        tvQuotes.setText(getResources().getString(R.string.quotes));
        return root;
        //return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
