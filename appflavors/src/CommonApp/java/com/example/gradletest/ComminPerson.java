package com.example.gradletest;

import com.example.alibrary.Person;

public class ComminPerson {

    public Person getPerson() {
        return person;
    }

    private final Person person;

    public ComminPerson() {
        person = new Person();
        person.setName("CommonPerson");
        person.setAge(0);
    }
}
