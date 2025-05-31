
package StudentRegistrationSystem;

public class CourseList {
    
    private Course[] courses;

    public CourseList() {
        courses = new Course[] {
            new Course("CSE"),
            new Course("EEE"),
            new Course("BBA"),
            new Course("BTech"),
            new Course("Pharmacy")
        };
    }

    public void showCourses() {
        System.out.println("\nAvailable Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public Course getCourseByName(String name) {
        for (Course course : courses) {
            if (course.getName().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }
    
}
