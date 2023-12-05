public class BenarSalah extends Soal {
    private static int jumlahSoal;

    public BenarSalah(String soal, Boolean jawaban) {
        this.pertanyaan = soal;
        this.jawaban = jawaban ? "benar" : "salah";
        jumlahSoal++;
    }

    public static int getJumlahSoal() {
        return jumlahSoal;
    }

    public static void removeSoal() {
        jumlahSoal--;
    }

    @Override
    public void showQuestion() {
        System.out.println(getPertanyaan());
    }

    @Override
    public void giveQuestion() {
        System.out.println();
        System.out.println(getPertanyaan() + " (Benar/Salah)");
        System.out.print(": ");
    }
}
