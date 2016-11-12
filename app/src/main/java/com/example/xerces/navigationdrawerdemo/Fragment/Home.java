package com.example.xerces.navigationdrawerdemo.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xerces.navigationdrawerdemo.IESActivity;
import com.example.xerces.navigationdrawerdemo.R;


public class Home extends Fragment {

    View view;
    CardView cvGate,cvPSU,cvMPSC,cvIES;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home,container,false);
        getActivity().setTitle("Home");

        cvGate = (CardView)view.findViewById(R.id.cv_gate);
        cvPSU = (CardView)view.findViewById(R.id.cv_psu);
        cvIES = (CardView)view.findViewById(R.id.cv_ies);
        cvMPSC = (CardView)view.findViewById(R.id.cv_mpsc);

        cvIES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),IESActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }
}
