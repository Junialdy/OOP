package Implement1;

public class Kubus extends Persegi {
    protected Kubus(double sisi) {
        super(sisi);
    }

    protected double getVolume() { // SISI * SISI * SISI
        setBil(getLuas(), sisi);
        return getPerkalian();
    }

    protected double getLuasPermukaan() { // 6 * SISI * SISI
        setBil(getLuas(), 6);
        return getPerkalian();
    }

    protected double getRusukDiagonal() { // SISI * √3
        setBil(3, sisi);
        setBil1(getAkarBil1());
        return getPerkalian();
    }
}
