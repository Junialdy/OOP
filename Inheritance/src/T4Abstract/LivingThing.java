package T4Abstract;

public abstract class LivingThing {
    public void breath() {
        System.out.println("Living Thing breathing...");
    }

    public void eat() {
        System.out.println("Living Thing eating...");
    }

    // Kita ingin method ini di-overriden oleh subclasses
    public abstract void walk();
}
