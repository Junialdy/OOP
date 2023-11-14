package L2;

public class Square extends Shape {
    private double sisi;

    public Square(double sisi) {
        this.sisi = sisi;
    }

    public String getName() {
        return "Square Shape";
    }

    public double getArea() {
        return sisi * sisi;
    }
}
