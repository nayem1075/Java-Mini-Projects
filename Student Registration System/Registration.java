
package StudentRegistrationSystem;

public class Registration {
    
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void showDetails() {
        System.out.println("\n Registration Successful!");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Registered Course: " + course.getName());
    }
    
}
