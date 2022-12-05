package ru.job4j.tracker;

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
        int id = input.askInt("Enter id: ");
        while (store.delete(id)) {
            out.println("Заявка удалена.");
        }
        return true;
    }
}
