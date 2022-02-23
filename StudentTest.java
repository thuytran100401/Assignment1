/**
 * Assignment 1, exercise 1
 * StudentTest class
 * @author Thuy Tran
 * February 21, 2022
 */

public class StudentTest {
    public static void main(String[] args) {
        // create new Student
        Student student = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science");
        // display student information and course schedule
        System.out.println(student.toString());
        System.out.println("Course Schedule: ");
        Student.Course course = student.new Course();
        course.printSchedule();
    }
}