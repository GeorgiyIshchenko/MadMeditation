package com.example.madmeditation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        getSupportFragmentManager().
                beginTransaction().replace(R.id.start_activity, new StartFragment()).
                commit();
    }
}