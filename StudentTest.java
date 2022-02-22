

public class StudentTest {
    public static void main(String[] args) {
        // create new Student
        Student student = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science");
        // display student and course schedule
        Student.Course course = student.new Course();
        course.printSchedule();
    }
}