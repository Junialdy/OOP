public class Persegi {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getKeliling() {
        Aritmatika keliling = new Aritmatika(sisi, sisi); // bil1 = 10, bil 2 = 10
        keliling.setBil2(keliling.getPenjumlahan()); // bil1 = 20, bil 2 = 10
        keliling.setBil2(keliling.getPenjumlahan()); // bil1 = 30, bil 2 = 20
        return keliling.getPenjumlahan(); // 30 + 10 = 40
    }

    public double getLuas() {
        Aritmatika luas = new Aritmatika(sisi, sisi);
        return luas.getPerkalian();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}