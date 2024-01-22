public class Teacher {

    /**
     * This class is created with the intent to create and manage teachers (and their respective information)
     * Represents a teacher with a name and a subject.
     */
    private String name;
    private String subject;

    /**
     * Constructor for creating a new Teacher object.
     * Initializes a teacher with the provided name and subject.
     *
     * @param name    The name of the teacher.
     * @param subject The subject that the teacher teaches.
     */
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject() {
        this.subject = subject;
    }


    /**
     * Provides a string representation of the Teacher object to be utilized in Main.java:
     * a methode used to display the teacher's name and subject in a readable format.*

     * @return A string representing the teacher, including their name and subject.
     */
    @Override // a method definition to indicate that the method is intended to override a method declared in a parent class.
    public String toString() {
    return "Name: " + name + " Subject: " + subject;
    }
}
