package alpha;

public class Aritmatika {
    protected double bil1, bil2;

    // Constructor
    public Aritmatika() {
    }

    public Aritmatika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    // Accessor
    public double getBil1() {
        return this.bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public double getPenjumlahan() {
        return bil1 + bil2;
    }

    public double getPengurangan() {
        return bil1 - bil2;
    }

    public double getPerkalian() {
        return bil1 * bil2;
    }

    public double getPembagian() {
        return bil1 / bil2;
    }

    public double getAkarBil1() {
        return Math.sqrt(bil1);
    }

    public double getAkarBil2() {
        return Math.sqrt(bil2);
    }

    // Mutator
    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

    public void setBil(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
}
