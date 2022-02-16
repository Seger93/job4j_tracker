package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemAscByNameTest {

    @Test
    public void compareAsc() {
        List<Item> item = Arrays.asList(new Item("aaa"), new Item("sss"),
                new Item("ddd"));
        List<Item> expected = List.of(new Item("aaa"), new Item("ddd"),
                new Item("sss"));
        item.sort(new ItemAscByName());
        assertThat(item, is(expected));
    }
}