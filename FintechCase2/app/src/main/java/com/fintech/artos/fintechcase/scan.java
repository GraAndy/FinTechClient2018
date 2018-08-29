package com.fintech.artos.fintechcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class scan extends AppCompatActivity implements View.OnClickListener {
    Button oplat, butap;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.fintech.artos.fintechcase.R.layout.activity_scan);
        getSupportActionBar().setTitle("Официант №526");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        oplat = (Button) findViewById(com.fintech.artos.fintechcase.R.id.oplata);
        edit = (EditText) findViewById(com.fintech.artos.fintechcase.R.id.edi);
        oplat.setOnClickListener(this);
    }









    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return false;
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent(scan.this, Spasibo.class);
        intent.putExtra("edit", edit.getText().toString());
        startActivity(intent);}}

