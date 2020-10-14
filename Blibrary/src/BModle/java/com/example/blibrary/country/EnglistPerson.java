package com.example.blibrary.country;


import com.example.blibrary.bean.Person;

public class EnglistPerson extends Person {
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public EnglistPerson(){
        setID("BModle");
    }
}
