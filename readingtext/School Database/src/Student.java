public class Student {

    private String firstName;
    private String lastName;
    private String grade;
    private int uniqueNumber;
    private static int nextStudentNumber = 1000;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = String.valueOf ( 0 ); // NOT SURE IF IT WORKS YET
        this.uniqueNumber = uniqueNumber;
        nextStudentNumber++;
    }

    public int getStudentNumber() {
        return uniqueNumber;
    }
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grades: " + grade + " Unique student number: " + uniqueNumber;
    }
}
