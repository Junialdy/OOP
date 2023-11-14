package L2;

public class Circle extends Shape {
    private double jarijari;

    public Circle(double jarijari) {
        this.jarijari = jarijari;
    }

    public String getName() {
        return "Circle Shape";
    }

    public double getArea() {
        return 3.14 * jarijari * jarijari;
    }
}
