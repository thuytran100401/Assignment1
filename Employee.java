/*
 * Employee class:
 *  has all the attributes and functionality of a person. 
 *  an employee should have the following attributes: employee id, 
 *      employee status (can be contractor, full time, part time), pay amount. 
 *  
 *  an employee should have the following attributes: employee id, 
 *      employee status (can be contractor, full time, part time), pay amount. 
 *  
 *  For part time employees and contractors pay units are per hour. 
 *      For full time employees pay units are per year.
 *  Therefore, based on the employee status the employee pay units can be determine.
 */

public class Employee extends Person {
    // variable 
    private int id;
    private String status;
    private double basePay;

    // constructor
    public Employee(String firstName, String lastName, int age, String ssn,
    String address, String gender, double weight, int id, String status, double basePay) {
        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    // method to print their own introduction by overriding,
    // to display to command line all their information as a person as well as 
    // additional employee information (employee id, status, and pay compensation).  
    @Override
    public void introduce() {
        System.out.println(toString());
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " + id + "\nStatus" + status +"\nBase Pay: " + basePay;
    }

    /*
     * Method to accepts the number of units worked (number of hours for part time
     *  employees and contractors or the number of weeks for full time employees).
     * This method should check the value of the employee status and use the proper logic 
     *  to compute the paycheck amount based on the base pay and the number of units of work. 
     */
    public double calculatePay(double unitsWorked) {
        if (status.equalsIgnoreCase("Part Time")) {
            return basePay * unitsWorked;
        } else if (status.equalsIgnoreCase("Full Time")) {
            return basePay * 1/52 * unitsWorked;
        } else {
            return basePay * unitsWorked;
        }
    }
}

