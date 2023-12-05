# Project-Final OOP: Management Quiz

Project java yang menggunakan konsep Inheritance, Polimofisme, dan Encapsulation.
Project ini dapat membuat soal Quiz, mengedit, delete, serta menjalankannya.

### Code Backup

```
case 5:
                    System.out.println("+────────────────────+");
                    System.out.println("|  Delete Soal Quiz  |");
                    System.out.println("+────────────────────+");
                    boolean doDeleteSoal = true;
                    while (doDeleteSoal) {
                        System.out.print("\nMasukkan ID Soal: ");
                        int idSoal = -1;
                        try {
                            idSoal = Integer.parseInt(dataIn.readLine());
                            if (pertanyaan[idSoal] == null)
                                throw new Exception();
                        } catch (Exception e) {
                            System.out.println("\n───────────────────────────────────");
                            System.out.println("| Error! ID Soal tidak ditemukan. |");
                            System.out.println("───────────────────────────────────");
                            System.out.println("\nApakah ingin mendelete ID lainnya? (y/n)");
                            System.out.print(": ");
                            String again = dataIn.readLine().toLowerCase();
                            if (again.equals("n")) {
                                doDeleteSoal = false;
                            }
                            continue;
                        }
                        int julmahSoal = PilihanGanda.getJumlahSoal() + Essay.getJumlahSoal();
                        if (pertanyaan[idSoal].getClass() == PilihanGanda.class) {
                            PilihanGanda.removeSoal();
                        } else if (pertanyaan[idSoal].getClass() == Essay.class) {
                            Essay.removeSoal();
                        }

                        for (int i = idSoal; i < julmahSoal; i++) {
                            if (pertanyaan[i + 1] != null) {
                                if (pertanyaan[i + 1].getClass() == PilihanGanda.class) {
                                    pertanyaan[i].setAll(pertanyaan[i + 1].getPertanyaan(),
                                            pertanyaan[i + 1].pilihan[0],
                                            pertanyaan[i + 1].pilihan[1],
                                            pertanyaan[i + 1].pilihan[2],
                                            pertanyaan[i + 1].pilihan[3],
                                            pertanyaan[i + 1].getJawaban());
                                    // pertanyaan[i + 1].setAll(null, null, null, null, null, null);
                                    pertanyaan[i + 1] = new PilihanGanda();
                                    doDeleteSoal = false;
                                    System.out.println("\n ────────────────────────");
                                    System.out.println("| Data Berhasil dihapus! |");
                                    System.out.println(" ────────────────────────");
                                } else if (pertanyaan[i + 1].getClass() == Essay.class) {
                                    pertanyaan[i].setAll(pertanyaan[i + 1].getPertanyaan(),
                                            pertanyaan[i + 1].getJawaban());
                                    // pertanyaan[i + 1].setAll(null, null);
                                    pertanyaan[i + 1] = new Essay();
                                    doDeleteSoal = false;
                                    System.out.println("\n ────────────────────────");
                                    System.out.println("| Data Berhasil dihapus! |");
                                    System.out.println(" ────────────────────────");
                                }
                            } else {
                                if (pertanyaan[i].getClass() == PilihanGanda.class) {
                                    // pertanyaan[i].setAll(null, null, null, null, null, null);
                                    pertanyaan[i] = new PilihanGanda();
                                    PilihanGanda.removeSoal();
                                } else if (pertanyaan[i].getClass() == Essay.class) {
                                    // pertanyaan[i].setAll(null, null);
                                    pertanyaan[i] = new Essay();
                                    Essay.removeSoal();
                                }
                                doDeleteSoal = false;
                                System.out.println("\n ────────────────────────");
                                System.out.println("| Data Berhasil dihapus! |");
                                System.out.println(" ────────────────────────");
                            }
                        }

                        // System.out.println("200 OK");
                    }
                    break;
```
