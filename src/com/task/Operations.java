package com.task;

import java.io.*;
import java.util.*;

public class Operations {

    FileWriter writer;

    public void getPersonByAddress(ArrayList<Person> personList) throws IOException {
        Scanner scanner = new Scanner(System.in);
        writer = new FileWriter("output.txt");
        System.out.println("Please enter the name of the street");
        String street = scanner.nextLine();

        boolean counter = false;
        for (Person person : personList) {
            if (person.getStreet().getName().equals(street.trim())) {
                counter = true;
                System.out.println(person.getName() + "lives at the " + street + " street.");
                writer.write(person.getName() + "lives at the " + street + " street.");
            }
        }
        if (!counter) {
            System.out.println("There is no such people living at these street.");
            writer.write("There is no such people living at these street.");
        }
    }

    public void getPersonBySurname(ArrayList<Person> personList) throws IOException {
        Scanner scanner = new Scanner(System.in);
        writer = new FileWriter("output2.txt");
        System.out.println("Please enter surname of the person: ");
        String surname = scanner.nextLine();

        boolean counter = false;
        for (Person person : personList) {
            if (person.getSurname().equals(surname.trim())) {
                counter = true;
                System.out.println(person.getName() + " " + person.getSurname());
                writer.write(person.getName() + " " + person.getSurname());
            }
        }
        if (!counter) {
            System.out.println("There is no such people living at these street.");
            writer.write("There is no such people living at these street.");
        }
    }

    public void getYoungest(ArrayList<Person> personList) throws IOException {
        writer = new FileWriter("output3.txt");
        Person person = Collections.max(personList);
        System.out.println(person.getName() + " " + person.getSurname() + " is the youngest.");
        writer.write(person.getName() + " " + person.getSurname() + " is the youngest.");
    }

    public void getOldest(ArrayList<Person> personList) throws IOException {
        writer = new FileWriter("output4.txt");
        Person person = Collections.min(personList);
        System.out.println(person.getName() + " " + person.getSurname() + " is the oldest.");
        writer.write(person.getName() + " " + person.getSurname() + " is the oldest.");
    }

    public void getPeopleBetweenTwoDates(ArrayList<Person> personList,
                                          Date firstDate, Date secondDate)
            throws IOException {
        writer = new FileWriter("output5.txt");
        long firstDateInMillis = firstDate.getTime();
        long secondDateInMillis = secondDate.getTime();

        System.out.println("Persons between two dates: ");
        writer.write("Persons between two dates: ");
        for (Person person : personList) {
            if (person.getBirthDate().getTime() > firstDateInMillis &&
                    person.getBirthDate().getTime() < secondDateInMillis) {
                System.out.println(person.getName() + " " + person.getSurname());
                writer.write(person.getName() + " " + person.getSurname());
            }
        }
    }

    public void getPeopleOnTheSameStreets(ArrayList<Person> personList) throws IOException {
        writer = new FileWriter("output6.txt");

        ArrayList<String> streets = new ArrayList<String>();
        for (Person person : personList) {
            streets.add(person.getStreet().getName());
        }

        List<String> list = streets;
        Set<String> set = new LinkedHashSet<>(list);
        for (String street : set) {
            System.out.println(street + " street: ");
            writer.write(street + " street: ");
            for (Person person : personList) {
                if (person.getStreet().getName().equals(street)) {
                    System.out.println(person.getName() + " " + person.getSurname());
                    writer.write(person.getName() + " " + person.getSurname());
                }
            }
        }
    }
}

