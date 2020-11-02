package com.example.kuafortasarim.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.kuafortasarim.R;

import br.com.sapereaude.maskedEditText.MaskedEditText;


public class PhoneFragment extends Fragment {

    MaskedEditText phone;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_phone, container, false);
        phone = view.findViewById(R.id.phone);
        return view;

    }


}
