/*
 * Employee Test class:
 *  This class should implement main() method.
 *  This class should create Employee instances and display ther information.
 * 
 * Thuy Tran, February 22, 2022
 */

public class EmployeeTest {
    public static void main(String[] args) {
        // create Employee instances
        Employee employee0 = new Employee("Joe", "Smith", 18, "123456", "200 First Str San Jose, CA 95112", "Male", 70, 1, "Contractor", 60);
        Employee employee1 = new Employee("Lisa", "Gray", 19, "789101", "201 First Str San Jose, CA 95112", "Female", 80, 2, "full time", 110000);
        Employee employee2 = new Employee("Timothy", "Briggs", 20, "121314", "202 First Str San Jose, CA 95112", "Male", 90, 3, "Full Time", 80000);
        Employee employee3 = new Employee("George", "Wallace", 21, "151617", "203 First Str San Jose, CA 95112", "Male", 60, 4, "part time", 20);
        Employee employee4 = new Employee("Amy", "Student", 22, "181920", "204 First Str San Jose, CA 95112", "Female", 75, 5, "Contractor", 45);
    
        // all introduce() and calculatePay() on each one and display the results of calculatePay() method 
        employee0.introduce();
        System.out.println("Paid Amount: " + employee0.calculatePay(30));
        System.out.println("\n------------------------------------------\n");

        employee1.introduce();
        System.out.println("Paid Amount: " + employee1.calculatePay(2));
        System.out.println("\n------------------------------------------\n");

        employee2.introduce();
        System.out.println("Paid Amount: " + employee2.calculatePay(4));
        System.out.println("\n------------------------------------------\n");

        employee3.introduce();
        System.out.println("Paid Amount: " + employee3.calculatePay(25));
        System.out.println("\n------------------------------------------\n");

        employee4.introduce();
        System.out.println("Paid Amount: " + employee4.calculatePay(45));


    
    }

}