package Implement2;

public class App {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga(10, 12);
        Limas limas1 = new Limas(12, 12, 10);
        System.out.println("\nLuas Segitiga 1: " + segitiga1.getLuas() + " cm²");
        System.out.println("Keliling Segitiga 1: " + segitiga1.getKeliling() + "cm\n");
        System.out.println("Volume Limas 1: " + limas1.getVolume() + " cm²");
        System.out.println("Luas Permukan Limas 1: " + limas1.getLuasPermukaan() + "cm²");
    }
}