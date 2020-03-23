package stragery;

public class Paint {
    public static void draw(Shape shape) {
        System.out.print(shape.draw());
    }
    public static void main(String[] args) {
        Square s = new Square();
        Triangle t = new Triangle();
        draw(s);
        draw(t);
    }
}
