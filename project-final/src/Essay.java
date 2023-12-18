public class Essay extends Soal {
    private static int jumlahSoal;

    public Essay(int id, String soal, String jawaban) {
        super(id, soal, jawaban);
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
        System.out.println(getPertanyaan());
        System.out.print(": ");
    }

}
