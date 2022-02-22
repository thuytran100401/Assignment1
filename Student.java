/*
 * Student class:
 *  This class will contain the following fields: first name (String),
 *      last name (String), age (int), gpa (float), major, department
 *  It will have getters and setters for all its attributes.
 *  Within class Student implement a nested non-static inner class called Course
 *  This class will declare and implement method printSchedule()
 */

public class Student {
    // variables for student information
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;

    // constructor
    public Student(String firstName, String lastName, int age, float gpa, String major, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }

    // getters and setters
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    /*
     * inner class for Course
     * method to print out the student's course schedule
     */
    public class Course {
        public void printSchedule() {
//            for (int course = 0, time = 0; course < courseData.length; course++, time++) {
//                if (time == 3) {
//                    System.out.println();
//                   time = 0;
//                }
//                System.out.print("" + courseData[course]);
//            }
            System.out.println("CS151 Tue/Thur 6-7:15");
            System.out.println("Eng101 Mon/Wed 10-11:15");
            System.out.println("Hist100 Tue/Thur 1:30-2:45");
        }
    }

    // method to display student information and schedule
//    public void print(String course[]) {
        // display student information
//        System.out.println(firstName + " " + lastName + ", " + age + " years old, "
//        + gpa + " gpa, " + major + " major," + department + " department.");
        
//        System.out.println("\n ************** Course Schedule *************");

        // create new Course
//        Course cou = new Course();
        // display course schedule
//        cou.printSchedule(course);
//    }
}