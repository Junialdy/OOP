package T1Inheritance;

public class Person {
    protected String name;
    protected String address;

    public Person() {
        System.out.println("Inside Person: Constructor");
        name = "";
        address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
