package com.example.appbuildonebyflavors;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.blibrary.country.EnglistPerson;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "OneMainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "EnglistPerson ： = " + new EnglistPerson().getID());
    }
}
