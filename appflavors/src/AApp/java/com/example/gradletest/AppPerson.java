package com.example.gradletest;

import com.example.alibrary.Person;

public class AppPerson {

    public Person getPerson() {
        return person;
    }

    private Person person;

    public AppPerson() {
        person = new Person();
        person.setName("AApp");
        person.setAge(0);
        person = new ComminPerson().getPerson();
    }
}
