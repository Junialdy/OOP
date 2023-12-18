public class PilihanGanda extends Soal {
    private static int jumlahSoal;

    public PilihanGanda(int id, String soal, String A, String B, String C, String D, String jawaban) {
        super(id, soal, A, B, C, D, jawaban);
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
        String pilihan[] = getPilihan();
        System.out.println("A. " + pilihan[0]);
        System.out.println("B. " + pilihan[1]);
        System.out.println("C. " + pilihan[2]);
        System.out.println("D. " + pilihan[3]);
    }

    @Override
    public void giveQuestion() {
        System.out.println();
        System.out.println(getPertanyaan());
        String pilihan[] = getPilihan();
        System.out.println("A. " + pilihan[0]);
        System.out.println("B. " + pilihan[1]);
        System.out.println("C. " + pilihan[2]);
        System.out.println("D. " + pilihan[3]);
        System.out.print(": ");
    }

}
