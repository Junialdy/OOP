import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        boolean stop = false;
        int max = 20;
        Soal pertanyaan[] = new Soal[max];
        String jawabanUser[] = new String[max];
        pertanyaan[0] = new PilihanGanda("Apa ibukota Indonesia?", "Jakarta", "Surabaya", "Bandung", "Medan",
                "A");
        pertanyaan[1] = new PilihanGanda("Berapakah hasil dari 5 + 3?", "7", "8", "9", "10", "B");
        pertanyaan[3] = new PilihanGanda("Hewan apakah yang memiliki belalai panjang?", "Gajah", "Singa", "Kuda",
                "Jerapah", "A");
        pertanyaan[2] = new Essay("Berapa nilai percepatan gravitasi bumi? ... m/s²",
                "9,8");
        pertanyaan[4] = new Essay("Apa nama ilmu yang mempelajari planet-planet dan benda langit di luar angkasa?",
                "Astronomi");
        pertanyaan[5] = new BenarSalah("Apakah Kucing memiliki 5 kaki?", false);
        System.out
                .println("\n                                                                                \r\n" + //
                        "                                                                                \r\n" + //
                        "                 ..:::^^^^^:::..                ..:::^^^^^:::..                 \r\n" + //
                        "             .:^~~~~~~~~~~~~~~~~~^:.        .:^~~~~~~~~~~~~~~~~~^:.             \r\n" + //
                        "           .^~~~~~~~~~~~~~~~~~~~~~~~^:    :^~~~~~~~~~~~~~~~~~~~~~~~^.           \r\n" + //
                        "         .^~~~~~~~~~~^:....:~~~~~~~~~~~:  :~~~~~~~~~~~~~~~~~~~~~~~~~~^.         \r\n" + //
                        "        .~~~~~~~~~~~. .:^:. .^~~~~~~~~~~:  :~~~~~~~~~~~~~~~~^^~~~~~~~~~.        \r\n" + //
                        "        ^~~~~~~~~~~~::~~~!~  :~~~~~~~~~~~.  ^~~~~~~~~~~~~~^.  :~~~~~~~~^        \r\n" + //
                        "       .~~~~~~~~~~~~~~~~^:  :~~~~~~~~~~~~:  :~~~~^ .:~~~^.  .^~~~~~~~~~~.       \r\n" + //
                        "       .~~~~~~~~~~~~~~~^  :~~~~~~~~~~~~~~:  :~~~~~:. .:.  :^~~~~~~~~~~~~.       \r\n" + //
                        "        :~~~~~~~~~~~~~~~^^~~~~~~~~~~~~~~~. .~~~~~~~~:.  :~~~~~~~~~~~~~~:        \r\n" + //
                        "         :~~~~~~~~~~~~~^..^~~~~~~~~~~~~~.  ^~~~~~~~~~~^~~~~~~~~~~~~~~~^         \r\n" + //
                        "          .^~~~~~~~~~~~^::~~~~~~~~~~~~:   ^!~~~~~~~~~~~~~~~~~~~~~~~~^.          \r\n" + //
                        "            .~~~~~~~~~~~~~~~~~~~~~~^:.    .:^~~~~~~~~~~~~~~~~~~~~~~.            \r\n" + //
                        "            .~~~~~~~~~~~~~~~~~~^:..          .::^~~~~~~~~~~~~~~~~~~.            \r\n" + //
                        "           .~~~~~~~^:.........                    .........:^~~~~~~~.           \r\n" + //
                        "           .:^::...                                          ..:::^:.           \r\n" + //
                        "                                                                                \r\n" + //
                        "                            Selamat Datang di Quiz ABC                          \r\n" + //
                        "                                                                                \r\n" + //
                        "                                                                                ");

        while (!stop) {
            System.out.println("\n┌─────────────────────┐");
            System.out.println("|      Pilih Aksi     |");
            System.out.println("|─────────────────────|");
            System.out.println("| 1. Mulai Quiz       |");
            System.out.println("| 2. List Soal Quiz   |");
            System.out.println("| 3. Tambah Soal Quiz |");
            System.out.println("| 4. Edit Soal Quiz   |");
            System.out.println("| 5. Hapus Soal Quiz  |");
            System.out.println("| 6. Keluar           |");
            System.out.println("└─────────────────────┘");
            System.out.print(": ");
            int action = -1;
            try {
                action = Integer.parseInt(dataIn.readLine());
            } catch (NumberFormatException e) {
                action = -1;
            } finally {
                System.out.println(); // add newline
            }
            switch (action) {
                case 1:
                    if (PilihanGanda.getJumlahSoal() <= 0 && Essay.getJumlahSoal() <= 0) {
                        System.out.println("┌──────────────────────────────────────────────────────────────────┐");
                        System.out.println("| Quiz tidak memiliki Soal! Silahkan buat soalnya terlebih dahulu. |");
                        System.out.println("└──────────────────────────────────────────────────────────────────┘");
                        break;
                    }
                    System.out.println("┌───────────────────┐");
                    System.out.println("|  Quiz dimulai~~.  |");
                    System.out.println("└───────────────────┘");
                    while (true) {
                        if (PilihanGanda.getJumlahSoal() > 0) {
                            System.out.println("\n┌────────────────────┐");
                            System.out.println("│ Soal Pilihan Ganda │");
                            System.out.println("└────────────────────┘");
                            for (int i = 0; i < pertanyaan.length; i++) {
                                if (pertanyaan[i] == null || pertanyaan[i].getClass() != PilihanGanda.class)
                                    continue;
                                pertanyaan[i].giveQuestion();
                                jawabanUser[i] = dataIn.readLine();
                                if (jawabanUser[i].equalsIgnoreCase(pertanyaan[i].getJawaban())) {
                                    System.out.println("Good job! Jawaban kamu benar");
                                } else {
                                    System.out.println(
                                            "Damn, u stpid asf. jawabannya adalah: "
                                                    + pertanyaan[i].getJawaban());
                                }
                            }
                        }
                        if (Essay.getJumlahSoal() > 0) {
                            System.out.println("\n┌────────────┐");
                            System.out.println("│ Soal Essay │");
                            System.out.println("└────────────┘");
                            for (int i = 0; i < pertanyaan.length; i++) {
                                if (pertanyaan[i] == null || pertanyaan[i].getClass() != Essay.class)
                                    continue;
                                pertanyaan[i].giveQuestion();
                                jawabanUser[i] = dataIn.readLine().toLowerCase();
                                if (jawabanUser[i].contains(pertanyaan[i].getJawaban().toLowerCase())) {
                                    System.out.println("Good job! Jawaban kamu benar");
                                } else {
                                    System.out.println(
                                            "Damn, u stpid asf. jawabannya adalah: "
                                                    + pertanyaan[i].getJawaban());
                                }
                            }
                        }
                        if (BenarSalah.getJumlahSoal() > 0) {
                            System.out.println("\n┌────────────────────┐");
                            System.out.println("│ Soal Benar / Salah │");
                            System.out.println("└────────────────────┘");
                            for (int i = 0; i < pertanyaan.length; i++) {
                                if (pertanyaan[i] == null || pertanyaan[i].getClass() != BenarSalah.class)
                                    continue;
                                pertanyaan[i].giveQuestion();
                                jawabanUser[i] = dataIn.readLine().toLowerCase();
                                if (jawabanUser[i].equalsIgnoreCase(pertanyaan[i].getJawaban())) {
                                    System.out.println("Good job! Jawaban kamu benar");
                                    // System.out.println(jawabanUser[i].);
                                } else {
                                    System.out.println(
                                            "Damn, u stpid asf. jawabannya adalah: "
                                                    + pertanyaan[i].getJawaban());
                                }
                            }
                        }

                        System.out.println("\nApakah kamu ingin mengulang Quiz? (y/n)");
                        System.out.print(": ");
                        String again = dataIn.readLine();
                        if (again.toLowerCase().equals("n")) {
                            break;
                        }
                    }

                    break;
                case 2:
                    if (PilihanGanda.getJumlahSoal() <= 0 && Essay.getJumlahSoal() <= 0) {
                        System.out.println("┌──────────────────────────────────────────────────────────────────┐");
                        System.out.println("| Quiz tidak memiliki Soal! Silahkan buat soalnya terlebih dahulu. |");
                        System.out.println("└──────────────────────────────────────────────────────────────────┘");
                        System.out.println();
                        break;
                    }
                    if (PilihanGanda.getJumlahSoal() > 0) {
                        System.out.println("┌────────────────────────┐");
                        System.out.println("| Soal Pilihan Ganda (" + PilihanGanda.getJumlahSoal() + ") |");
                        System.out.println("└────────────────────────┘");
                        for (int i = 0; i < pertanyaan.length; i++) {
                            try {
                                if (pertanyaan[i].getClass() != PilihanGanda.class || pertanyaan[i] == null)
                                    continue;

                                System.out.println("\nID Soal: " + i);
                                pertanyaan[i].showQuestion();
                            } catch (NullPointerException e) {
                                continue;
                            }
                        }
                    }
                    if (Essay.getJumlahSoal() > 0) {
                        System.out.println("\n┌────────────────┐");
                        System.out.println("| Soal Essay (" + Essay.getJumlahSoal() + ") |");
                        System.out.println("└────────────────┘");
                        for (int i = 0; i < pertanyaan.length; i++) {
                            try {
                                if (pertanyaan[i].getClass() != Essay.class || pertanyaan[i] == null)
                                    continue;

                                System.out.println("\nID Soal: " + i);
                                pertanyaan[i].showQuestion();
                            } catch (NullPointerException e) {
                                continue;
                            }
                        }
                    }
                    if (BenarSalah.getJumlahSoal() > 0) {
                        System.out.println("\n┌────────────────────────┐");
                        System.out.println("| Soal Benar / Salah (" + BenarSalah.getJumlahSoal() + ") |");
                        System.out.println("└────────────────────────┘");
                        for (int i = 0; i < pertanyaan.length; i++) {
                            try {
                                if (pertanyaan[i].getClass() != BenarSalah.class || pertanyaan[i] == null)
                                    continue;

                                System.out.println("\nID Soal: " + i);
                                pertanyaan[i].showQuestion();
                            } catch (NullPointerException e) {
                                continue;
                            }
                        }
                    }
                    System.out.println(); // add newline
                    break;
                case 3:
                    int jenisSoal = -1;
                    boolean doJenisSoal = true;
                    System.out.println("┌──────────────────┐");
                    System.out.println("|  Buat Soal Quiz  |");
                    System.out.println("└──────────────────┘");
                    while (doJenisSoal) {
                        System.out.println("\nPilih Jenis Quiz");
                        System.out.println("1. Pilihan Ganda");
                        System.out.println("2. Essay");
                        System.out.println("3. Benar / Salah");
                        System.out.println("4. Kembali");
                        System.out.print(": ");
                        try {
                            jenisSoal = Integer.parseInt(dataIn.readLine());
                        } catch (NumberFormatException e) {
                            jenisSoal = -1;
                        } finally {
                            System.out.println(); // add newline
                        }
                        boolean doAgain = true;
                        switch (jenisSoal) {
                            case 1:
                                while (doAgain) {
                                    System.out.print("Soal: ");
                                    String soal = dataIn.readLine();
                                    System.out.print("A: ");
                                    String pilihanA = dataIn.readLine();
                                    System.out.print("B: ");
                                    String pilihanB = dataIn.readLine();
                                    System.out.print("C: ");
                                    String pilihanC = dataIn.readLine();
                                    System.out.print("D: ");
                                    String pilihanD = dataIn.readLine();
                                    System.out.print("Jawaban (A/B/C/D): ");
                                    String jawaban = dataIn.readLine().toUpperCase();
                                    // check is jawban A / B / C / D
                                    int i = PilihanGanda.getJumlahSoal() + Essay.getJumlahSoal()
                                            + BenarSalah.getJumlahSoal();
                                    pertanyaan[i] = new PilihanGanda(soal, pilihanA, pilihanB, pilihanC,
                                            pilihanD, jawaban);
                                    System.out.println("\n1. Tambah Lagi");
                                    System.out.println("2. Jenis Lain");
                                    System.out.println("3. Ke Halaman Awal");
                                    System.out.print(": ");
                                    int soalAction = -1;
                                    try {
                                        soalAction = Integer.parseInt(dataIn.readLine());
                                    } catch (NumberFormatException e) {
                                        soalAction = -1;
                                    } finally {
                                        System.out.println(); // add newline
                                    }
                                    switch (soalAction) {
                                        case 1:
                                            break;
                                        case 2:
                                            doAgain = false;
                                            break;
                                        case 3:
                                            doAgain = false;
                                            doJenisSoal = false;
                                            break;

                                        default:
                                            System.out.println("┌──────────────────────────────────────┐");
                                            System.out.println("| Invalid Input! Pilih aksi antara 1-3 |");
                                            System.out.println("└──────────────────────────────────────┘");
                                            break;
                                    }
                                }

                                break;
                            case 2:
                                while (doAgain) {
                                    System.out.print("Soal: ");
                                    String soal = dataIn.readLine();
                                    System.out.print("Jawaban: ");
                                    String jawaban = dataIn.readLine();
                                    int i = PilihanGanda.getJumlahSoal() + Essay.getJumlahSoal()
                                            + BenarSalah.getJumlahSoal();
                                    pertanyaan[i] = new Essay(soal, jawaban);
                                    System.out.println("\n1. Tambah Lagi");
                                    System.out.println("2. Jenis Lain");
                                    System.out.println("3. Ke Halaman Awal");
                                    System.out.print(": ");
                                    int soalAction = -1;
                                    try {
                                        soalAction = Integer.parseInt(dataIn.readLine());
                                    } catch (NumberFormatException e) {
                                        soalAction = -1;
                                    } finally {
                                        System.out.println(); // add newline
                                    }
                                    switch (soalAction) {
                                        case 1:
                                            break;
                                        case 2:
                                            doAgain = false;
                                            break;
                                        case 3:
                                            doAgain = false;
                                            doJenisSoal = false;
                                            break;
                                        default:
                                            System.out.println("┌──────────────────────────────────────┐");
                                            System.out.println("| Invalid Input! Pilih aksi antara 1-3 |");
                                            System.out.println("└──────────────────────────────────────┘");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                while (doAgain) {
                                    System.out.print("Soal: ");
                                    String soal = dataIn.readLine();
                                    System.out.print("Jawaban: ");
                                    String temp = dataIn.readLine();
                                    Boolean jawaban = temp.toLowerCase() == "benar" ? true : false;
                                    int i = PilihanGanda.getJumlahSoal() + Essay.getJumlahSoal()
                                            + BenarSalah.getJumlahSoal();
                                    pertanyaan[i] = new BenarSalah(soal, jawaban);
                                    System.out.println("\n1. Tambah Lagi");
                                    System.out.println("2. Jenis Lain");
                                    System.out.println("3. Ke Halaman Awal");
                                    System.out.print(": ");
                                    int soalAction = -1;
                                    try {
                                        soalAction = Integer.parseInt(dataIn.readLine());
                                    } catch (NumberFormatException e) {
                                        soalAction = -1;
                                    } finally {
                                        System.out.println(); // add newline
                                    }
                                    switch (soalAction) {
                                        case 1:
                                            break;
                                        case 2:
                                            doAgain = false;
                                            break;
                                        case 3:
                                            doAgain = false;
                                            doJenisSoal = false;
                                            break;

                                        default:
                                            System.out.println("┌──────────────────────────────────────┐");
                                            System.out.println("| Invalid Input! Pilih aksi antara 1-3 |");
                                            System.out.println("└──────────────────────────────────────┘");
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                doJenisSoal = false;
                                break;

                            default:
                                System.out.println("┌──────────────────────────────────────┐");
                                System.out.println("| Invalid Input! Pilih aksi antara 1-4 |");
                                System.out.println("└──────────────────────────────────────┘");
                                break;
                        }

                    }
                    break;
                case 4:
                    boolean doEditSoal = true;
                    System.out.println("┌──────────────────┐");
                    System.out.println("|  Edit Soal Quiz  |");
                    System.out.println("└──────────────────┘");
                    while (doEditSoal) {
                        System.out.print("Masukkan ID Soal: ");
                        int idSoal = -1;
                        try {
                            idSoal = Integer.parseInt(dataIn.readLine());
                            System.out.println("Soal Lama: " + pertanyaan[idSoal].getPertanyaan());
                        } catch (Exception e) {
                            System.out.println("Error! ID Soal tidak ditemukan.");
                            continue;
                        }

                        if (pertanyaan[idSoal].getClass() == PilihanGanda.class) {
                            System.out.print("Soal Baru: ");
                            String soal = dataIn.readLine();
                            System.out.print("A: ");
                            String pilihanA = dataIn.readLine();
                            System.out.print("B: ");
                            String pilihanB = dataIn.readLine();
                            System.out.print("C: ");
                            String pilihanC = dataIn.readLine();
                            System.out.print("D: ");
                            String pilihanD = dataIn.readLine();
                            System.out.print("Jawaban (A/B/C/D): ");
                            String jawaban = dataIn.readLine().toUpperCase();
                            pertanyaan[idSoal].setAll(soal, pilihanA, pilihanB, pilihanC, pilihanD, jawaban);
                            System.out.println("\n┌─────────────────────────┐");
                            System.out.println("|  Soal Berhasil diedit!  |");
                            System.out.println("└─────────────────────────┘");
                            doEditSoal = false;
                        } else if (pertanyaan[idSoal].getClass() == Essay.class) {
                            System.out.print("Soal Baru: ");
                            String soal = dataIn.readLine();
                            System.out.print("Jawaban: ");
                            String jawaban = dataIn.readLine().toLowerCase();
                            pertanyaan[idSoal].setAll(soal, jawaban);
                            System.out.println("\n┌─────────────────────────┐");
                            System.out.println("|  Soal Berhasil diedit!  |");
                            System.out.println("└─────────────────────────┘");
                            doEditSoal = false;
                        } else if (pertanyaan[idSoal].getClass() == BenarSalah.class) {
                            System.out.print("Soal Baru: ");
                            String soal = dataIn.readLine();
                            System.out.print("Jawaban (Benar/Salah): ");
                            String temp = dataIn.readLine();
                            Boolean jawaban = temp.toLowerCase() == "benar" ? true : false;
                            pertanyaan[idSoal].setAll(soal, jawaban);
                            System.out.println("\n┌─────────────────────────┐");
                            System.out.println("|  Soal Berhasil diedit!  |");
                            System.out.println("└─────────────────────────┘");
                            doEditSoal = false;
                        } else {
                            System.out.println("\nPertanyaan dengan Class \"" + pertanyaan[idSoal].getClass()
                                    + "\" tidak dapat diubah!");
                        }
                    }

                    break;
                case 5:
                    System.out.println("┌────────────────────┐");
                    System.out.println("|  Delete Soal Quiz  |");
                    System.out.println("└────────────────────┘");
                    boolean doDeleteSoal = true;
                    while (doDeleteSoal) {
                        System.out.print("\nMasukkan ID Soal: ");
                        int idSoal = -1;
                        try {
                            idSoal = Integer.parseInt(dataIn.readLine());
                            if (pertanyaan[idSoal] == null)
                                throw new Exception();
                        } catch (Exception e) {
                            System.out.println("┌─────────────────────────────────┐");
                            System.out.println("| Error! ID Soal tidak ditemukan. |");
                            System.out.println("└─────────────────────────────────┘");
                            System.out.println("\nApakah ingin mendelete ID lainnya? (y/n)");
                            System.out.print(": ");
                            String again = dataIn.readLine().toLowerCase();
                            if (again.equals("n")) {
                                doDeleteSoal = false;
                            }
                            continue;
                        }
                        if (pertanyaan[idSoal].getClass() == PilihanGanda.class) {
                            PilihanGanda.removeSoal();
                        } else if (pertanyaan[idSoal].getClass() == Essay.class) {
                            Essay.removeSoal();
                        } else if (pertanyaan[idSoal].getClass() == BenarSalah.class) {
                            BenarSalah.removeSoal();
                        }
                        Soal temp[] = new Soal[max];
                        for (int i = 0, k = 0; i < pertanyaan.length; i++) {
                            if (pertanyaan[i] == null || i == idSoal) {
                                continue;
                            } else {
                                temp[k++] = pertanyaan[i];
                            }
                        }

                        pertanyaan = temp;
                        doDeleteSoal = false;
                    }
                    System.out.println("┌────────────────────────┐");
                    System.out.println("| Data Berhasil dihapus! |");
                    System.out.println("└────────────────────────┘");
                    break;
                case 6:
                    System.out.println("\nGood bye~~\n");
                    stop = true;
                    break;

                default:
                    System.out.println("\n┌──────────────────────────────────────┐");
                    System.out.println("| Invalid Input! Pilih aksi antara 1-6 |");
                    System.out.println("└──────────────────────────────────────┘");
                    break;
            }
        }
    }
}
