package L2;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("args[" + i + "]=" + args[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("args[" + i + "]= null");
            }
        }
    }
}
