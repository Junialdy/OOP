package L1;

public class StudentRecord {
    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;
    protected static int studentCount;

    // Overloading Constructor
    public StudentRecord() {
        studentCount++;
    }

    public StudentRecord(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        studentCount++;
    }

    public StudentRecord(double mGrade, double eGrade, double sGrade) {
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }

    // Accessor

    public double getAverage() {
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    // Mutator

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }
}