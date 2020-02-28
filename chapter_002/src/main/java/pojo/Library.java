package pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Момент истины", 502);
        Book book2 = new Book("Clean code", 200);
        Book book3 = new Book("Иван", 102);
        Book book4 = new Book("Head first.Java", 650);
        Book[] lib = new Book[4];
        lib[0] = book1;
        lib[1] = book2;
        lib[2] = book3;
        lib[3] = book4;
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            System.out.println(book.getName() + ",  " + book.getVolume() + " стр.");
        }
        lib[0] = book4;
        lib[3] = book1;
        System.out.println();
        System.out.println("Новый массив");
        System.out.println();
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            System.out.println(book.getName() + ",  " + book.getVolume() + " стр.");
        }
        System.out.println();
        for (Book book:lib) {
            if (book.getName() .equals("Clean code")) {
                System.out.println(book.getName() + ",  " + book.getVolume() + " стр.");
            }
        }
    }
}
