package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combineSurname = sur -> sur.getSurname().contains(key);
        Predicate<Person> combinePhone = pho -> pho.getPhone().contains(key);
        Predicate<Person> combineName = nam -> nam.getName().contains(key);
        Predicate<Person> combineAddress = ad -> ad.getAddress().contains(key);
        Predicate<Person> combine = combineSurname.or(combineName.or(combinePhone.or(combineAddress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

