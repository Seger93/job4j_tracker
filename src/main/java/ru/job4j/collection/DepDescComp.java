package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        String[] o1 = first.split("/");
        String[] o2 = second.split("/");
        if (o2[0].compareTo(o1[0]) == 0) {
            return  first.compareTo(second);
        }
        return o2[0].compareTo(o1[0]);
    }
}

