import java.util.ArrayList;

    /* vocabulary
    private: restricts its access to the class itself in terms of modification and accessibility
    "this." calls upun the method to differentiate between class fields and parameters
     public String get____() --> To get something, it returns a string value, but doens't take prameters. It is to get the value of the fields, so when
    this field is called, it will return the current value of the field
    public void set____() ---> To set something is to not return any value, its purpose is to set parameters and use it to set or modify
     */

public class School {
    /**
     * Bellow represents all the fields present:
     * @param teachers the array for all the teachers.
     * @param students the array for all the students
     * @param name the names of the teachers or students
     * @param year the year of birth
     * @param principal the principal of the school
     */
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    //3 fields of my choosing
    private String name;
    private String year;
    private String principal;

    // THE CONDUCTOR: setting the initial values of the fields so they can be modified and used later
    public School(String name, String year, String principal) {
        // to call upon the private (fields) of the array list to create an arraylist (for them)
        this.teachers = new ArrayList<> ( );
        this.students = new ArrayList<> ( );
        //Each of the fields are now called upon with (by specifying with this.) accessed by the school object
        this.name = name;
        this.year = year;
        this.principal = principal;
    }

    // ---------------------------------------------------------------
    /** GETTERS AND SETTER
     * "get" allows for the private fields to be accessed in a controlled environment
     * @return to the private field (for all the public String bellow)
     *
     * "set" are used for, in this case the methods used to modify the contents of private fields
     *            (accepted within the perimeters)
     * "this." will call the fields specifically and update the values to whichever variable it is assigned to
     *              which can be used later on while utilizing the method
     */
    // ---------------------------------------------------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getPrincipal() {
        return principal;
    }
    public void setPrincipal() {
        this.principal = principal;
    }

    //--------------------- Methods --------------------------
    public void addTeacher(Teacher teacher) {
        teachers.add ( teacher );     // Add a teacher to list
    }
    public void addStudent(Student student) {
        students.add ( student ); // Add a student to list
    }
    public void deleteTeacher(Teacher teacher) {
        teachers.remove ( teacher ); // Delete a teacher from list
    }
    public void deleteStudent(Student student) {
        students.remove ( student ); // Delete a student from list
    }

    /**
     *the "for loop" bellow will run the duration of how many teachers/ students are in the teachers/students
    array list while printing out each of the teacher/ student (adding to the array list)
     */
    public void showAllTeachers() { // Show all teachers
        for ( Teacher teacher : teachers ) {
            System.out.println ( teacher );
        }
    }
    public void showAllStudents() {     // Show all students
        for ( Student student : students ) {
            System.out.println ( student );
        }
    }
}
