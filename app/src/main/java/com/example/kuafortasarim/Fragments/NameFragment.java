package com.example.kuafortasarim.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.kuafortasarim.R;
import com.zigis.materialtextfield.MaterialTextField;


public class NameFragment extends Fragment {

    MaterialTextField name;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_name, container, false);

        name = view.findViewById(R.id.name);


        return view;
    }
}
