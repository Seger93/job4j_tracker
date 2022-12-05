package ru.job4j.tracker;

import java.util.Iterator;
import java.util.List;

public class DeleteItemsProf implements UserAction {

    private final Output out;

    public DeleteItemsProf(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete all item";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Delete Items ====");
        List<Item> items = store.findAll();
        for (Item item : items) {
            store.delete(item.getId());
            out.println("Заявка удалена.");
        }
        return true;
    }
}
