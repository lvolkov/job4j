package tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        System.out.println(tracker.findById(id));
        return false;
    }
}
