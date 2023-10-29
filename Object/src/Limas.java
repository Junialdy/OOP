public class Limas {
    private double sisiAlas;
    private double sisiTegak;
    private double tinggiTegak;

    public Limas(double sisiAlas, double sisiTegak, double tinggiTegak) {
        this.sisiAlas = sisiAlas;
        this.sisiTegak = sisiTegak;
        this.tinggiTegak = tinggiTegak;
    }

    public double getVolume() {
        Persegi luasAlas = new Persegi(sisiAlas);
        Aritmatika lst = new Aritmatika(luasAlas.getLuas(), tinggiTegak); // 1/3 * Luas Alas * Tinggi
        lst.setBil1(lst.getPerkalian());
        lst.setBil2(3);
        return lst.getPembagian();
    }

    public double getLuasPermukaan() {
        Persegi luasAlas = new Persegi(sisiAlas);
        Segitiga luasSisiTegak = new Segitiga(sisiTegak, tinggiTegak);
        Aritmatika lst = new Aritmatika(4, luasSisiTegak.getLuas());
        lst.setBil2(lst.getPerkalian());
        lst.setBil1(luasAlas.getLuas());
        return lst.getPenjumlahan();
    }

    public double getSisiAlas() {
        return sisiAlas;
    }

    public void setSisiAlas(double sisiAlas) {
        this.sisiAlas = sisiAlas;

    }
}
