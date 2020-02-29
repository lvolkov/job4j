package pojo;
/**
 *  метод обнуляет выбранную ячейку и сортирует массив с этой позиции
 *  все индексы меньше выбранного не проверяются
 * @author Leonid Volkov (l.volkov@list.ru)
 * @version 1
 * @since 29.02.2020
 */
public class Shop {
    public static Product[] delete(Product[] products, int index) {
    products[index] = null;
       for (int i = index; i < products.length-1; i++) {
            if (products[i] == null) {
                products[i] = products[i + 1];
                products[i + 1] = null;
            }
        }
        products[products.length-1]=null;
        return products;
    }
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        delete(products,1);
        for(int i=0; i<products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
