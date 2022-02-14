package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lyziifer_rab@mai.ru", "Гербов Сергей Владимирович");
        map.put("WWWLeningrad@Spb.ru", "Шнуров Сергей Владимирович");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
