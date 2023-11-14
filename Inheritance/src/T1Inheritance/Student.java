package T1Inheritance;

public class Student extends Person {
    public Student() {
        System.out.println("Inside Student: Constructor");
    }

    public Student(String name, String address) {
        super(name, address);
        System.out.println("\nInside Student: Constructor with Super keyword");
        System.out.println("Super.name: " + super.name);
        System.out.println("Super.address: " + super.address + "\n");
    }

}