package tracker;

public class Animal {
   private String name;
    public Animal() {
    }
    public Animal(String animal){
        name = animal;
        System.out.println(getClass());
    }
}
