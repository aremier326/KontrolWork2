package com.task;

import java.util.Date;

public class Person implements Comparable<Person>{
    private String name;

    private String surname;

    private Date birthDate;

    private Street street;

    public Person() {};

    public Person(String name, String surname, Date birthDate, Street street) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int compareTo(Person o) {
        return this.getBirthDate().compareTo(o.getBirthDate());
    }

}
