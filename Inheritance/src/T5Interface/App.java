package T5Interface;

public class App {
    public static void main(String[] args) {
        Line objectA = new Line(11, 12, 13, 14);
        Line objectB = new Line(20, 30, 40, 50);
        System.out.println("ObjectA.length(): " + objectA.getLength());
        System.out.println("ObjectB.length(): " + objectB.getLength());
        System.out.println("oA > oB ? " + objectA.isGreater(objectA, objectB));
        System.out.println("oA < oB ? " + objectA.isLess(objectA, objectB));
        System.out.println("oA = oB ? " + objectA.isEqual(objectA, objectB));
        System.out.println("\n");
    }
}
