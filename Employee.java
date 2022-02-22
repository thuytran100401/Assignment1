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
    private double payAmount;

    // constructor
    public Employee(String firstName, String lastName, int age, String ssn,
    String address, String gender, double weight, int id, String status, double payAmount) {
        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.payAmount = payAmount;
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

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }
}