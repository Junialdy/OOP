package L2;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("args[" + i + "]=" + args[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e.fillInStackTrace());
                System.err.println("Quiting...");
            }
        }
    }
}
