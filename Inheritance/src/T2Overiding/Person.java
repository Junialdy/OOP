package T2Overiding;

public class Person {
    protected String name;
    protected String address;

    public String getName() {
        System.out.println("Parent: getName");
        return name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
