package com.register.demo.models;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favLanguage;
    private String[] system;


    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    public String[] getSystem() {
        return system;
    }

    public void setSystem(String[] system) {
        this.system = system;
    }
}
