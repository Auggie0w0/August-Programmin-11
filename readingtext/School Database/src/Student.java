public class Student {

    /**
     * The Student class is used to add and manage students:
     * Represents a student with a first name, last name, grade, and it also generates a unique student number for each student
     */
    private String firstName;
    private String lastName;
    private int grade;
    private int uniqueNumber;  // Unique identifier for each student
    private static int nextStudentNumber = 1000; // Static counter for generating unique numbers

    /**
     * Constructor for creating a new Student object.
     * Each student is initialized with a first name, last name, and grade. A unique student number
     * is automatically assigned, nextStudentNumber ++ means that the number will increase by each student.
     *
     * @param firstName The first name of the student.
     * @param lastName  The last name of the student.
     * @param grade     The current grade of the student.
     */
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.uniqueNumber = nextStudentNumber++; // Auto-increment to ensure unique number
    }

    /**
     * Provides the unique student number.
     * This method is used to access the unique identifier assigned to each student.
     *
     * @return The unique number assigned to the student.
     */
    public int getStudentNumber() {
        return uniqueNumber;
    }

    /**
     * Provides a string representation of the Student object.
     * This method is used to display the student's full name, grade, and unique number in a readable format.
     *
     * @return A string representing the student, including their name, grade, and unique number.
     */
    @Override // a method definition to indicate that the method is intended to override a method declared in a parent class.
    public  String toString() {
        return "Name: " + firstName + " " + lastName + " | Grade: " + grade + " | Student Number: " + uniqueNumber;
    }
}
