package com.example.kuafortasarim.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;
import com.example.kuafortasarim.R;
import com.example.kuafortasarim.adapters.Sehirler;


public class CityFragment extends Fragment {
    View view;
    SmartMaterialSpinner spinner_sehir;
    Sehirler sehirler = new Sehirler();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_city, container, false);
        spinner_sehir = view.findViewById(R.id.spinner_sehir);
        spinner_sehir.setItem(sehirler.getSehirListesi());

        return view;
    }
}
