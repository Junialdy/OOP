
public class Persegi {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getKeliling() {
        Aritmatika keliling = new Aritmatika(sisi, sisi); // bil1 = 10, bil 2 = 10
        keliling.setBil2(keliling.getPenjumlahan()); // bil1 = 20, bil 2 = 10
        keliling.setBil2(keliling.getPenjumlahan()); // bil1 = 30, bil 2 = 20
        return keliling.getPenjumlahan(); // 30 + 10 = 50
    }
}
