package com.example.gradletest;


import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Bundle;

import com.example.blibrary.bean.Person;

public class AppPerson {

    public Person getPerson() {
        return person;
    }

    private final Person person;

    public AppPerson() {
        person = new Person();
        person.setName("BApp");
        person.setAge(1);
        @SuppressLint({"NewApi", "LocalSuppress"})
        AudioAttributes attributesApa = new AudioAttributes.Builder().setLegacyStreamType(AudioManager.STREAM_ALARM).build();
        Bundle bundle = attributesApa.getPrivateBundle();
    }
}
