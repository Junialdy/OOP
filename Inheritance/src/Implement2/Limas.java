package Implement2;

public class Limas extends Segitiga {
    private double sisiAlas;
    private double sisiTegak;
    private double tinggiTegak;

    protected Limas(double sisiAlas, double sisiTegak, double tinggiTegak) {
        super(sisiTegak, tinggiTegak);
        this.sisiAlas = sisiAlas;
        this.sisiTegak = sisiTegak;
        this.tinggiTegak = tinggiTegak;
    }

    protected double getVolume() {
        Persegi luasAlas = new Persegi(sisiAlas);
        setBil(luasAlas.getLuas(), tinggiTegak); // 1/3 * Luas Alas * Tinggi
        setBil1(getPerkalian());
        setBil2(3);
        return getPembagian();
    }

    protected double getLuasPermukaan() {
        Persegi luasAlas = new Persegi(sisiAlas);
        setBil(4, getLuas());
        setBil2(getPerkalian());
        setBil1(luasAlas.getLuas());
        return getPenjumlahan();
    }

    protected double getSisiAlas() {
        return sisiAlas;
    }

    protected double sisiTegak() {
        return sisiTegak;
    }

    protected void setSisiAlas(double sisiAlas) {
        this.sisiAlas = sisiAlas;

    }
}
