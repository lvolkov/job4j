package tracker;

//import java.util.Scanner;

import java.util.Arrays;

public class StartUI {
        public void init(Input input, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                //System.out.print("Select: ");
                int select = Integer.parseInt(input.askStr("Select: "));
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    //System.out.print("Enter name: ");
                    String name = input.askStr("Enter name: ");
                    Item item = new Item(name);
                    tracker.add(item);
                    System.out.println("The Item " + "'" + name + "'"+", id " + item.getId() + " added");

                 } else if (select == 1) {
                    System.out.println("=== Show all Item ====");
                    Item[] item = tracker.findAll();
                    for ( int i=0; i < item.length; i++)
                    item[i].prnt();
                 } else if (select == 2) {
                    System.out.println("=== Edit item ====");
                    //System.out.print("Enter id: ");
                    String id = input.askStr("Enter id: ");
                    Item name = new Item (input.askStr("Enter name: "));
                    tracker.replace(id,name);
                    System.out.println("Item replaced, new name " + name.getName());
                 } else if (select == 3) {
                    System.out.println("=== Delete item ====");
                    //System.out.print("Enter id: ");
                    String id = input.askStr("Enter id: ");
                    boolean aDelite = tracker.delete(id);
                    if(aDelite) {
                        System.out.println( " Item deleted");
                    } else {
                        System.out.println( " Item didn't delete");
                    }
                 } else if (select == 4) {
                    System.out.println("=== Find item by Id ====");
                    //System.out.print("Enter id: ");
                    String id = input.askStr("Enter id: ");
                    System.out.println(tracker.findById(id));
                 } else if (select == 5) {
                    System.out.println("=== Find items by name ====");
                    //System.out.print("Enter name: ");
                    String name = input.askStr("Enter name: ");
                    System.out.println(String.valueOf(tracker.findByName(name)));
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
