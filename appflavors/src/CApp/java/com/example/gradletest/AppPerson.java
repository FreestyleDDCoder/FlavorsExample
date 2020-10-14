package com.example.gradletest;

import com.example.alibrary.Person;

public class AppPerson {

    public Person getPerson() {
        return person;
    }

    private final Person person;

    public AppPerson() {
        person = new Person();
        person.setName("CApp");
        person.setAge(2);
    }
}
