import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a new school instance with a name, year, and principal
        School myschool = new School ( "Sentinel Secondary", "2024","Mr. Finch" );

        /**
         * @param Student is from the Student class, indicating a requirement of insertion (firstname,lastName, grade)
         * @param addStudent is one of the methods from the School class, and it is used as myschool in main.java
         *                   to which one can add student to the Student Class
         * @param addTeacher same as addStudent, but to the Teacher class instead
         * @param Teacher is from the Teacher Class, indicating a requirement of insertion (name, subject)
         */
        // Adding students and teachers to the school by utilizing the school class, and adding to the student class for using the toString when printed later
        myschool.addStudent(new Student ( "Amber", "Lam",10 ));
        myschool.addStudent(new Student (  "Eric", "Li",10 ));
        myschool.addStudent(new Student ( "Mandy", "Xiao",10) );
        myschool.addStudent(new Student (  "Melanie", "Suen",10) );
        myschool.addStudent(new Student (  "Ted", "Middleton",10 ));
        myschool.addStudent(new Student (  "Katryn", "Schedvichi",10) );
        myschool.addStudent(new Student ( "Sunny", "He",10 ));
        myschool.addStudent(new Student ( "Jolin", "Ruan",10 ));
        myschool.addStudent(new Student (  "Gojo", "Satoru",12 ));
        myschool.addStudent(new Student (  "Osamu", "Dazai",12 ));

        myschool.addTeacher (new Teacher ( "M Naami","Math"));
        myschool.addTeacher (new Teacher ( "Mme Pla","French"));
        myschool.addTeacher (new Teacher ( "Miyamoto Sensei","Japanese"));

        // Display the initial list of teachers and students
        System.out.println ( "Teachers:" );
        myschool.showAllTeachers ();

        System.out.println ( "\nStudents:" );
        myschool.showAllStudents ();

        // Remove a student and a teacher by its index
        myschool.deleteStudent (0);
        myschool.deleteTeacher ( 2 );

        // Display the updated list of teachers and students after removals
        System.out.println ( "\nUpdated  List:\nTeachers:" );
        myschool.showAllTeachers ();
        System.out.println ( "\nStudents:" );
        myschool.showAllStudents ();

    }
}
