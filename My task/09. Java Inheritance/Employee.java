// Java Inheritance - parent class Employee.

public class Employee {
    // protected, so child classes can use them
    protected String name;
    protected int id;

    // sets name and id
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // shows name and id, child classes use this too
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
