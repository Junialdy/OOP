package alpha;

public class Kubus extends Persegi {

    public Kubus(double sisi) {
        super(sisi);
    }

    public double getVolume() {
        setBil(getPerkalian(), sisi);
        return getPerkalian();
    }

    public double getLuasPermukaan() {
        setBil(6, getLuas());
        return getPerkalian();
    }

    public double getRusukDiagonal() {
        setBil(3, sisi);
        setBil1(getAkarBil1());
        return getPerkalian();
    }
}
