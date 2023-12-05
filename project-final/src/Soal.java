public abstract class Soal {
    // Pilihan Ganda
    // BenarSalah
    // Essay

    protected String pertanyaan;
    protected String[] pilihan = new String[4];
    protected String jawaban;

    protected String getPertanyaan() {
        return pertanyaan;
    }

    protected String getJawaban() {
        return jawaban;
    }

    protected String[] getPilihan() {
        return pilihan.clone();
    }

    public abstract void giveQuestion();

    public abstract void showQuestion();

    public void setAll(String soal, String A, String B, String C, String D, String jawaban) {
        pertanyaan = soal;
        pilihan[0] = A;
        pilihan[1] = B;
        pilihan[2] = C;
        pilihan[3] = D;
        this.jawaban = jawaban;
    }

    public void setAll(String soal, String jawaban) {
        this.pertanyaan = soal;
        this.jawaban = jawaban;
    }

    public void setAll(String soal, Boolean jawaban) {
        this.pertanyaan = soal;
        this.jawaban = jawaban ? "benar" : "salah";
    }

}
