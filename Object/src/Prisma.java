public class Prisma { // PRISMA SEGITIGA
    private double luasAlas, kelilingAlas, tinggi;

    public Prisma(double luasAlas, double kelilingAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.kelilingAlas = kelilingAlas;
        this.tinggi = tinggi;
    }

    public double getVolume() {
        Aritmatika v = new Aritmatika(luasAlas, tinggi); // LUAS ALAS * TINGGI
        return v.getPerkalian();
    }

    public double getLuasPermukaan() {
        Aritmatika lp = new Aritmatika(2, luasAlas); // 2 * LUAS ALAS + KELILING ALAS * TINGGI
        double temp = lp.getPerkalian();
        lp.setBil1(kelilingAlas);
        lp.setBil2(tinggi);
        lp.setBil2(lp.getPerkalian());
        lp.setBil1(temp);
        return lp.getPenjumlahan();
    }
}
