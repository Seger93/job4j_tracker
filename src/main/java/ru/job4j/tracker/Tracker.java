package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] nameKey = new Item[size];
        int res = 0;
        for (int i = 0; i < nameKey.length; i++) {
            Item name = items[i];
            if (key.equals(name.getName())) {
                nameKey[res] = name;
                res++;
            }
        }
        return Arrays.copyOf(nameKey, res);
    }
}