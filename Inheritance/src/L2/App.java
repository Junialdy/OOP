package L2;

public class App {
    public static void main(String[] args) {
        Circle shape1 = new Circle(5);
        Square shape2 = new Square(8);

        System.out.println("Shape 1 name: " + shape1.getName());
        System.out.println("Shape 1 area: " + shape1.getArea() + "\n");
        System.out.println("Shape 2 name: " + shape2.getName());
        System.out.println("Shape 2 area: " + shape2.getArea() + "\n");
    }
}
