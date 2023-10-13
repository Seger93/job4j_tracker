package ru.job4j.tracker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
public class HbmTrackerTest {

    @AfterEach
    public void clear() throws Exception {
        try (HbmTracker tracker = new HbmTracker()) {
                tracker.clearTable();
        }
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = new Item();
            item.setName("test1");
            tracker.add(item);
            Item result = tracker.findById(item.getId());
            assertThat(result.getName()).isEqualTo(item.getName());
        }
    }

    @Test
    public void whenReplaceItem() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = new Item();
            Item replaceItem = new Item();
            item.setName("test1");
            replaceItem.setName("replaceItem");
            tracker.replace(0, replaceItem);
            tracker.add(item);
            tracker.add(replaceItem);
            Item result = tracker.findById(replaceItem.getId());
            assertThat(result.getName()).isEqualTo(replaceItem.getName());
        }
    }

    @Test
    public void whenFindById() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = new Item();
            item.setName("test4");
            tracker.add(item);
            Item result = tracker.findById(item.getId());
            assertThat(result).isEqualTo(item);
        }
    }

    @Test
    public void whenFindByName() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = new Item();
            item.setName("test5");
            tracker.add(item);
            List<Item> result = tracker.findByName(item.getName());
            assertThat(result).isEqualTo(List.of(item));
        }
    }

    @Test
    public void whenDeleteItem() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item = new Item();
            tracker.add(item);
            boolean booLres = tracker.delete(item.getId());
            assertThat(booLres).isTrue();
            assertThat(tracker.findById(item.getId())).isNull();
        }
    }

    @Test
    public void whenFindAllThenList() throws Exception {
        try (var tracker = new HbmTracker()) {
            Item item1 = new Item("item1");
            Item item2 = new Item("item2");
            tracker.add(item1);
            tracker.add(item2);
            List<Item> result = tracker.findAll();
            assertThat(result).isEqualTo(List.of(item1, item2));
        }
    }
}