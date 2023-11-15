package Implement2;

public class Persegi extends Aritmatika {
    protected double sisi;

    protected Persegi(double sisi) {
        super(sisi, sisi);
        this.sisi = sisi;
    }

    protected double getKeliling() { // SISI + SISI + SISI + SISI
        setBil(sisi, sisi); // bil1 = 10, bil 2 = 10
        setBil2(getPenjumlahan()); // bil1 = 20, bil 2 = 10
        setBil2(getPenjumlahan()); // bil1 = 30, bil 2 = 20
        return getPenjumlahan(); // 30 + 10 = 40
    }

    protected double getLuas() { // SISI * SISI
        setBil(sisi, sisi);
        return getPerkalian();
    }

    protected double getSisi() {
        return sisi;
    }

    protected void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
