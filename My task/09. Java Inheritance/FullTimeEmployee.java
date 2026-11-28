// Child class of Employee for full-time employees.

// gets name, id and displayInfo() from Employee
public class FullTimeEmployee extends Employee {
    // only for full-time employees
    private double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        // calls the parent constructor
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // full-time salary is the monthly salary
    double calculateSalary() {
        return monthlySalary;
    }

}