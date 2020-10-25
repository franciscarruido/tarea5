package com.francistudio.animalapp.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.francistudio.animalapp.R;

public class Acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);

        androidx.appcompat.widget.Toolbar miActionBarmascotaFavorita = (androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBarmascotaFavorita);
        setSupportActionBar (miActionBarmascotaFavorita);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}