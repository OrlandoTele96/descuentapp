package com.example.descuentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ItemActivity extends AppCompatActivity {

    Promotion promo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Bundle bundle = new Bundle();

        bundle = getIntent().getExtras();

        promo = (Promotion) bundle.getSerializable(getResources().getString(R.string.key_item));

        Log.d(getResources().getString(R.string.logItemActivity),getResources().getString(R.string.logPrincipal_item)+promo.getPromotion());

    }
}
