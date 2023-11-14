package alpha;

public class Persegi extends Aritmatika {
    protected double sisi;

    public Persegi(double sisi) {
        super(sisi, sisi);
        this.sisi = sisi;
    }

    public double getKeliling() {
        setBil(sisi, sisi);
        setBil2(getPenjumlahan());
        setBil2(getPenjumlahan());
        return getPenjumlahan();
    }

    public double getLuas() {
        setBil(sisi, sisi);
        return getPerkalian();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
