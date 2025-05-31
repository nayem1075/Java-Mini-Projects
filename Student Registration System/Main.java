
package StudentRegistrationSystem;

import java.util.Scanner;

public class Main {
   
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CourseList courseList = new CourseList();

        System.out.println("=== Student Registration System ===");
        courseList.showCourses();

        System.out.print("\nEnter Course Name you want to register for: ");
        String courseName = input.nextLine();
        Course selectedCourse = courseList.getCourseByName(courseName);

        if (selectedCourse != null) {
            
            System.out.print("Enter Student Name: ");
            String name = input.nextLine();
            
            System.out.print("Enter Student ID: ");
            int id = input.nextInt();

            Student student = new Student(name,id);
            Registration registration = new Registration(student, selectedCourse);

            registration.showDetails();
            System.out.println("Registration Successfull");
        } else {
            System.out.println("❌ Course not found. Please try again.");
        }

        input.close();
    }
        
}
