public class Tabung {
    private double jarijari;
    private double tinggi;

    public Tabung(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    public double getLuasSelimut() {
        Aritmatika a = new Aritmatika(2, Math.PI);
        a.setBil1(a.getPerkalian());
        a.setBil2(jarijari);
        a.setBil1(a.getPerkalian());
        a.setBil2(tinggi);
        return a.getPerkalian();
    }

    public double getLuasPermukaan() {
        Lingkaran b = new Lingkaran(jarijari);
        Aritmatika c = new Aritmatika(2, b.getLuas());
        c.setBil2(c.getPerkalian());
        c.setBil1(getLuasSelimut());
        return c.getPenjumlahan();
    }

    public double getVolume() {
        Lingkaran d = new Lingkaran(jarijari);
        Aritmatika e = new Aritmatika(d.getLuas(), tinggi);
        return e.getPerkalian();
    }

    public double getJarijari() {
        return jarijari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
