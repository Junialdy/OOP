public class Aritmatika {
    private int bil1, bil2;

    // Constructor
    public Aritmatika() {
    }

    public Aritmatika(int input1, int bil2) {
        bil1 = input1;
        this.bil2 = bil2;
    }

    // Accessor
    public int getBil1() {
        return this.bil1;
    }

    public int getBil2() {
        return bil2;
    }

    public int getPenjumlahan() {
        return bil1 + bil2;
    }

    // Mutator
    public void setBil1(int input1) {
        bil1 = input1;
    }

    public void setBil2(int bil2) {
        this.bil2 = bil2;
    }
}