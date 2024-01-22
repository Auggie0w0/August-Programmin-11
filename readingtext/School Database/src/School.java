import java.util.ArrayList;

    /* vocabulary
    private: restricts its access to the class itself in terms of modification and accessibility
    "this." calls upon the method to differentiate between class fields and parameters
     public String get____() --> To get something, it returns a string value, but doesn't take parameters. It is to get the value of the fields, so when
    this field is called, it will return the current value of the field
    public void set____() ---> To set something is to not return any value, its purpose is to set parameters and use it to set or modify
     */

public class School {
    /**
     * Below represents all the fields present:
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
    /**
     * Adds a teacher to the school.
     * @param teacher The teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add ( teacher );
    }
    /**
     * Adds a student to the school.
     * @param student The student to be added.
     */
    public void addStudent(Student student) {
        students.add ( student );
    }

    /**
     * Removes a teacher from the school.
     * @param index The teacher to be removed at the mentioned index
     */
    /* by indicating each of the added teacher as a position (of index) removing specific teachers
     is made much easier this way, and for troubleshooting, the number will return invalid if it is
     bigger than the number of teachers there are (the first teacher being 0) */
    public void deleteTeacher(int index) {
        if (index >= 0 & index < teachers.size ()) {
            teachers.remove ( index);
        } else {
            System.out.println ( "Invalid index entered, this teacher does not exist" );
        }
    }

    /**
     * Removes a student from the school.
     * @param index The student to be removed at the mentioned index

     *by indicating each of the added student as a position (of index) removing specific student
     *      is made much easier this way, and for troubleshooting, the number will return invalid if it is
     *     bigger than the number of student there are (the first student being 0)

     */

    public void deleteStudent(int index) {
        if (index >= 0 & index < students.size ()) {
            students.remove ( index);
        } else {
            System.out.println ( "Invalid index entered, this student does not exist" );
        }
    }

    /**
     *the "for loop" bellow will run the duration of how many teachers/ students are in the teachers/students
    array list while printing out each of the teacher/ student (adding to the array list)
     @paraam
     */
    public void showAllTeachers() { // Show all teachers
        for ( int i =0; i <teachers.size(); i++) {
            System.out.println ( i+": " + teachers.get(i));
        }
    }

    public void showAllStudents() {     // Show all students
       for (int i = 0; i <students.size (); i++) {
           System.out.println ( i + ": " + students.get ( i ) );
        }
    }
}
