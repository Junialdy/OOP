package T3Polimorfisme;

public class Employee extends Person {
    public Employee(String name, String address) {
        super(name, address);
    }

    public String getName() {
        System.out.println("Employee Name: " + name);
        return name;
    }
}
