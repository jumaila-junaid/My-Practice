// Main class to test inheritance.

public class EmployeeMain {
    public static void main(String[] args) {
        // create a full-time and a part-time employee
        FullTimeEmployee fullTime = new FullTimeEmployee("Nimal", 101, 75000);
        PartTimeEmployee partTime = new PartTimeEmployee("Kumar", 202, 80, 500);

        // displayInfo() comes from the parent class
        // each child has its own salary logic
        fullTime.displayInfo();
        System.out.println("Salary: " + fullTime.calculateSalary());

        partTime.displayInfo();
        System.out.println("Salary: " + partTime.calculateSalary());
    }
}
