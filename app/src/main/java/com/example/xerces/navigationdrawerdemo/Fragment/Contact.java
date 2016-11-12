package com.example.xerces.navigationdrawerdemo.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xerces.navigationdrawerdemo.R;

/**
 * Created by Admin on 10/22/2016.
 */
public class Contact extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_contact,container,false);
        getActivity().setTitle("Contact");
        return view;

    }
}

