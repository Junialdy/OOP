package L1;

public class App {
    public static void main(String[] args) {
        StudentRecord antony = new StudentRecord("antony", "Lhokseumawe", 18);
        StudentRecord brian = new StudentRecord(89, 79, 90);
        ExtendStudentRecord frion = new ExtendStudentRecord(89, 91, 85, 95);

        System.out.println("Antony Address: " + antony.getAddress());
        System.out.println("Brian Grade Avarage: " + brian.getAverage());
        System.out.println("Frion Grade Avarage: " + frion.getAverage());
        System.out.println("Frion Computer Grade: " + frion.getComputerGrade());
        System.out.println("Student Count: " + StudentRecord.getStudentCount() + "\n");
    }
}
