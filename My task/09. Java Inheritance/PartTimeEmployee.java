// Child class of Employee for part-time employees.

// gets name, id and displayInfo() from Employee
public class PartTimeEmployee extends Employee {
    // only for part-time employees
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        // calls the parent constructor
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // part-time salary is hours worked x hourly rate
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
