package com.example.gradletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.alibrary.country.ChinaPerson;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "GradleTestMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Person ： = " + new AppPerson().getPerson().getName());
        ChinaPerson chinaPerson = new ChinaPerson();
        chinaPerson.setID("46000");
        Log.d(TAG, "Person ： = " + chinaPerson.getID());
    }
}