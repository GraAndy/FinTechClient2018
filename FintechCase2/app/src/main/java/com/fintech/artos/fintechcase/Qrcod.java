package com.fintech.artos.fintechcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Qrcod extends AppCompatActivity implements View.OnClickListener {
    Button scan_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.fintech.artos.fintechcase.R.layout.activity_qrcod);
        getSupportActionBar().setTitle("Сканируем QR-код");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        scan_bt = (Button) findViewById(com.fintech.artos.fintechcase.R.id.scan);
        scan_bt.setOnClickListener(this);

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
        Intent intent = new Intent(Qrcod.this, scan.class);
        startActivity(intent);}
}
