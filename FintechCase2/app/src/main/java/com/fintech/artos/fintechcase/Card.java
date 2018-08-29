package com.fintech.artos.fintechcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Card extends Fragment implements View.OnClickListener {

    private ImageButton but_card;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    { View view = null; view = inflater.inflate(com.fintech.artos.fintechcase.R.layout.activity_card, container, false);
        but_card = (ImageButton) view.findViewById(com.fintech.artos.fintechcase.R.id.imag);
        but_card.setOnClickListener(this);
        return view; }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case com.fintech.artos.fintechcase.R.id.imag:
                startActivity(new Intent(getActivity(), Inscard.class)); break; }

    }

}