package tracker;

public class StartUI {
    public static void creatItem(Input input,Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("The Item " + "'" + name + "'"+", id " + item.getId() + " added");
    }
    public static void showAll(Tracker tracker) {
        System.out.println("=== Show all Item ====");
        Item[] item = tracker.findAll();
        for ( int i=0; i < item.length; i++)
        System.out.println(item[i].toString());
    }
    public static void editItem(Input input,Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter id: ");
        Item name = new Item (input.askStr("Enter name: "));
        boolean aReplace = tracker.replace(id,name);
        if(aReplace) {
            System.out.println( " Item replaced");
        } else {
            System.out.println( " Item didn't replace");
        }
    }
    public static void deleteItem(Input input,Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id: ");
        boolean aDelite = tracker.delete(id);
        if (aDelite) {
            System.out.println(" Item deleted");
        } else {
            System.out.println(" Item didn't delete");
        }
    }
    public static void findItemById (Input input,Tracker tracker){
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter id: ");
        System.out.println(tracker.findById(id));
    }
    public static void findItemByName(Input input,Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        System.out.println(String.valueOf(tracker.findByName(name)));
    }
    public void init(Input input, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                int select = Integer.parseInt(input.askStr("Select: "));
                if (select == 0) {
                    StartUI.creatItem(input, tracker);
                 } else if (select == 1) {
                    StartUI.showAll(tracker);
                    } else if (select == 2) {
                    StartUI.editItem(input, tracker);
                 } else if (select == 3) {
                    StartUI.deleteItem(input, tracker);
                 } else if (select == 4) {
                    StartUI.findItemById(input, tracker);
                 } else if (select == 5) {
                    StartUI.findItemByName(input, tracker);
                 } else if (select == 6) {
                    System.out.println("=== Exit Program ====");
                    run = false;
                }
            }
        }
        private void showMenu() {
            System.out.println("Menu.");
            System.out.println("0.Add new Item");
            System.out.println("1.Show all items");
            System.out.println("2.Edit item");
            System.out.println("3.Delete item");
            System.out.println("4.Find item by Id");
            System.out.println("5.Find items by name");
            System.out.println("6.Exit Program");
         }
        public static void main(String[] args) {
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            new StartUI().init(input, tracker);
        }
}
