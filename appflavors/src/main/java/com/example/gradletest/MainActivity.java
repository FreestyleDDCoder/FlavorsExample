package com.example.gradletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.alibrary.country.ChinaPerson;
import com.example.blibrary.country.EnglistPerson;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "GradleTestMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Person ： = " + new AppPerson().getPerson().getName());
        Log.d(TAG, "ChinaPerson ： = " + new ChinaPerson().getID());
        Log.d(TAG, "EnglistPerson ： = " + new EnglistPerson().getID());
    }
}