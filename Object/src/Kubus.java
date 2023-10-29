public class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double getVolume() {
        Aritmatika v = new Aritmatika(sisi, sisi); // SISI * SISI * SISI
        v.setBil1(v.getPerkalian());
        return v.getPerkalian();
    }

    public double getLuasPermukaan() {
        Persegi pg = new Persegi(this.sisi);
        Aritmatika lp = new Aritmatika(6, pg.getLuas()); // 6 * SISI * SISI
        return lp.getPerkalian();
    }

    public double getRusukDiagonal() { // Sisi * √3
        Aritmatika rd = new Aritmatika(3, sisi);
        rd.setBil1(rd.getAkarBil1());
        return rd.getPerkalian();
    }
}
