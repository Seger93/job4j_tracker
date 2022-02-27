package ru.job4j.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> test = sur -> sur.getSurname().contains(key);
        Predicate<Person> test1 = pho -> pho.getPhone().contains(key);
        Predicate<Person> test2 = nam -> nam.getName().contains(key);
        Predicate<Person> test3 = ad -> ad.getAddress().contains(key);
        Predicate<Person> combine = test.or(test1.or(test2.or(test3)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

