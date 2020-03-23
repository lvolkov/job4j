package tracker;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        System.out.println(String.valueOf(tracker.findByName(name)));
        return true;
    }
}
