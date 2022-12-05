package ru.job4j.tracker;

public class CreateItemsProf implements UserAction {
    private final Output out;

    public CreateItemsProf(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Creating multiple items";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        out.println("=== Creating multiple items ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        for (int i = 0; i < 2000000000; i++) {
            memTracker.add(item);
        }
        return true;
    }
}
