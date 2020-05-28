package com.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Street> streets = new ArrayList<>();
        streets.add(new Street("Kurskaya"));
        streets.add(new Street("Romenskaya"));

        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Artem", "Meniak",
                new Date(2000, 4, 4), streets.get(0)));
        personList.add(new Person("Daria", "Kozlova",
                new Date(2000, 1, 26), streets.get(1)));
        personList.add(new Person("Ehor", "Shum",
                new Date(2000, 1, 7), streets.get(0)));

        Operations operations = new Operations();

        operations.getOldest(personList);
        operations.getYoungest(personList);
        operations.getPeopleOnTheSameStreets(personList);
        operations.getPersonByAddress(personList);
        operations.getPeopleBetweenTwoDates(personList, new Date(2000, 1, 1),
                new Date(2020, 1, 1));

    }
}
