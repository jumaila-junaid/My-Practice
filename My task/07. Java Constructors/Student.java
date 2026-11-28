// Create a Student class with constructors.

public class Student {
    // student details
    int studentId;
    String studentName;
    String course;

    // default constructor, sets default values
    Student() {
        studentId = 0;
        studentName = "Unknown";
        course = "Not Assigned";
    }

    // parameterized constructor, sets values given by the user
    Student(int studentId, String studentName, String course) {
        // this.studentId is the object's field, studentId is the parameter
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    // copy constructor, copies values from another student
    Student(Student other) {
        this.studentId = other.studentId;
        this.studentName = other.studentName;
        this.course = other.course;
    }

    // prints all details of the student
    void displayDetails() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
    }
}
