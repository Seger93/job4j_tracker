package ru.job4j.search;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person peers : persons) {
            if (peers.getSurname().contains(key) || peers.getPhone().contains(key)
            || peers.getName().contains(key) || peers.getAddress().contains(key)) {
                result.add(peers);
            }
        }
        return result;
    }
}

