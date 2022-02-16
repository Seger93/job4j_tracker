package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemDescByNameTest {

    @Test
    public void compareDesc() {
        List<Item> item = Arrays.asList(new Item("aaa"), new Item("sss"),
                new Item("ddd"));
        List<Item> expected = List.of(new Item("sss"), new Item("ddd"),
                new Item("aaa"));
        item.sort(new ItemDescByName());
        assertThat(item, is(expected));
    }
}
