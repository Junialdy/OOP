package T2Overiding;

public class Student extends Person {
    public Student(String name, String address) {
        super(name, address);
    }

    public String getName() {
        System.out.println("Student: getName");
        return name;
    }
}
