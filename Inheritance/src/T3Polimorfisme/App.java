package T3Polimorfisme;

public class App {
    public static void main(String[] args) {
        Person ref;
        Student vyctor = new Student("vyctor", "German");
        Employee karion = new Employee("karion", "German");

        ref = vyctor;
        String temp = ref.getName();
        System.out.println(temp);
        printInformation(ref);

        ref = karion;
        temp = ref.getName();
        System.out.println(temp);
        printInformation(ref);

    }

    public static void printInformation(Person p) {
        System.out.println(p.getClass() + "\n");
    }
}
