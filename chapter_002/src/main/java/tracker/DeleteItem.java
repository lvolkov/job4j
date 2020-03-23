package tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean aDelite = tracker.delete(id);
        if (aDelite) {
            System.out.println(" Item deleted");
        } else {
            System.out.println(" Item didn't delete");
        }
        return true;
    }
}
