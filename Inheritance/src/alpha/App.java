package alpha;

public class App {
    public static void main(String[] args) throws Exception {
        Persegi persegi1 = new Persegi(10);
        Persegi persegi2 = new Persegi(5);
        System.out.println("Keliling Persegi 1: " + persegi1.getKeliling());
        System.out.println("Keliling Persegi 2: " + persegi2.getKeliling());
        System.out.println("Luas Persegi 1: " + persegi1.getLuas());
        System.out.println("Luas Persegi 2: " + persegi2.getLuas());

        Kubus kubus1 = new Kubus(8);
        System.out.println("\nVolume Kubus 1 : " + kubus1.getVolume());
        System.out.println("Luas Permukaan Kubus 1 : " + kubus1.getLuasPermukaan());
        System.out.println("Rusuk Diagonal Kubus 1 : " + kubus1.getRusukDiagonal() + "\n");
    }
}
