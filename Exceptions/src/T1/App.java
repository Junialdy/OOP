package T1;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Exception caught!");
        }
    }
}
