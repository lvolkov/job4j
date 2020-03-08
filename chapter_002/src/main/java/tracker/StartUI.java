package tracker;

//import java.util.Scanner;

public class StartUI {
        public void init(Input input, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                System.out.print("Select: ");
                int select = Integer.parseInt(input.askStr("Select: "));
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    //System.out.print("Enter name: ");
                    String name = input.askStr("Enter name: ");
                    Item item = new Item(name);
                    tracker.add(item);
                 } else if (select == 1) {
                    System.out.println("=== Show all Item ====");
                    tracker.findAll();
                 } else if (select == 2) {
                    System.out.println("=== Edit item ====");
                    //System.out.print("Enter id: ");
                    String id = input.askStr("Enter id: ");
                    Item name = tracker.findById(id);
                    tracker.replace(id,name);
                 } else if (select == 3) {
                    System.out.println("=== Delete item ====");
                    //System.out.print("Enter id: ");
                    String id = input.askStr("Enter id: ");
                    tracker.delete(id);
                 } else if (select == 4) {
                    System.out.println("=== Find item by Id ====");
                    //System.out.print("Enter id: ");
                    String id = input.askStr("Enter id: ");
                    tracker.findById(id);
                 } else if (select == 5) {
                    System.out.println("=== Find items by name ====");
                    //System.out.print("Enter name: ");
                    String name = input.askStr("Enter name: ");
                    tracker.findByName(name);
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
