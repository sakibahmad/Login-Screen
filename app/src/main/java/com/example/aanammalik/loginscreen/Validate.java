package com.example.aanammalik.loginscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Aanam Malik on 7/22/2017.
 */

public class Validate extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validate);
        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
    }
}
