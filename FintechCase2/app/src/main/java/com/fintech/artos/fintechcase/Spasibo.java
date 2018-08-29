package com.fintech.artos.fintechcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Spasibo extends AppCompatActivity implements View.OnClickListener {
    TextView tex;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.fintech.artos.fintechcase.R.layout.activity_spasibo);

        tex = (TextView) findViewById(com.fintech.artos.fintechcase.R.id.ima2);
        Intent intent = getIntent();
        String edit = intent.getStringExtra("edit");
        tex.setText("Вы подарили: " + edit + " руб.");
        but = (Button) findViewById(com.fintech.artos.fintechcase.R.id.but);
        but.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Spasibo.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
