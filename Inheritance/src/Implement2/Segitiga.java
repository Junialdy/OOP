package Implement2;

public class Segitiga extends Aritmatika { // Segitiga Sama Sisi
    protected double sisi;
    protected double tinggi;

    protected Segitiga(double sisi) {
        super(sisi, sisi);
        this.sisi = sisi;
    }

    protected Segitiga() {

    }

    protected Segitiga(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    protected double getKeliling() {
        // SISI + SISI + SISI
        setBil(sisi, sisi);
        setBil1(getPenjumlahan());
        return getPenjumlahan();
    }

    protected double getLuas() {
        setBil(tinggi, sisi); // 1/2 * Alas/Sisi * Tinggi
        setBil1(getPerkalian());
        setBil2(2);
        return getPembagian();
    }

    protected double getSisi() {
        return sisi;
    }

    protected double getTinggi() {
        return tinggi;
    }

    protected void setSisi(double sisi) {
        this.sisi = sisi;
    }

    protected void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

}
