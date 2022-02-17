package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lef = left.split("\\.");
        String[] righ = right.split("\\.");
        return Integer.compare(Integer.parseInt(lef[0]), Integer.parseInt(righ[0]));
    }
}
