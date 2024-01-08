public class Teacher {

    /**
     *
     */

    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject() {
        this.subject = subject;
    }

    // to string here was used to perfectly represent the function is specifically used to provide a string that represents the "object"
    public String toString() {
    return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }
}
