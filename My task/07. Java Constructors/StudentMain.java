// Main class to create and display three students.

public class StudentMain {
    public static void main(String[] args) {
        // uses default constructor
        Student s1 = new Student();
        s1.displayDetails();

        // uses parameterized constructor
        Student s2 = new Student(101, "Jumaila", "BIT");
        s2.displayDetails();

        // uses copy constructor, copy of s2
        Student s3 = new Student(s2);
        s3.displayDetails();
    }
}
