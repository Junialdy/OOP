package L1;

public class ExtendStudentRecord extends StudentRecord {
    private double computerGrade;

    public ExtendStudentRecord(double mGrade, double eGrade, double sGrade, double computerGrade) {
        super(mGrade, eGrade, sGrade);
        this.computerGrade = computerGrade;
    }

    public ExtendStudentRecord(double computerGrade) {
        this.computerGrade = computerGrade;
        studentCount++;
    }

    public double getAverage() {
        average = (mathGrade + englishGrade + scienceGrade + computerGrade) / 4;
        return average;
    }

    public double getComputerGrade() {
        return computerGrade;
    }

    public void setComputerGrade(double computerGrade) {
        this.computerGrade = computerGrade;
    }

}
