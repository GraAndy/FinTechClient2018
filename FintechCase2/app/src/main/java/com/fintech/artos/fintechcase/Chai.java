package com.fintech.artos.fintechcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Chai extends Fragment implements View.OnClickListener {
    private Button but_nfc, qr_but, vruu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    { View view = null; view = inflater.inflate(com.fintech.artos.fintechcase.R.layout.activity_chai, container, false);
        but_nfc = (Button) view.findViewById(com.fintech.artos.fintechcase.R.id.nfsmet);
        qr_but = (Button) view.findViewById(com.fintech.artos.fintechcase.R.id.qrcod);
        vruu = (Button) view.findViewById(com.fintech.artos.fintechcase.R.id.vruchn);
        but_nfc.setOnClickListener(this);
        qr_but.setOnClickListener(this);
        vruu.setOnClickListener(this);
    return view; }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case com.fintech.artos.fintechcase.R.id.nfsmet:
                startActivity(new Intent(getActivity(), nfc.class));break;
                case com.fintech.artos.fintechcase.R.id.qrcod:
                startActivity(new Intent(getActivity(), Qrcod.class));
                break;
            case com.fintech.artos.fintechcase.R.id.vruchn:
                startActivity(new Intent(getActivity(), Vvodvruch.class));
                break;

        }

    }

}


