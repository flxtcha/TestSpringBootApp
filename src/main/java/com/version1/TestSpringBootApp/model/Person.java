package com.version1.TestSpringBootApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String surname;

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
