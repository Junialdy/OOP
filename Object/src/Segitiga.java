public class Segitiga { // Segitiga Sama Sisi
    private double sisi;
    private double tinggi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }

    public Segitiga(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double getKeliling() {
        Aritmatika keliling = new Aritmatika(sisi, sisi); // SISI + SISI + SISI
        keliling.setBil1(keliling.getPenjumlahan());
        return keliling.getPenjumlahan();
    }

    public double getLuas() {
        Aritmatika luas = new Aritmatika(sisi, tinggi); // 1/2 * Alas/Sisi * Tinggi
        luas.setBil1(luas.getPerkalian());
        luas.setBil2(2);
        return luas.getPembagian();
    }

    public double getSisi() {
        return sisi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

}
