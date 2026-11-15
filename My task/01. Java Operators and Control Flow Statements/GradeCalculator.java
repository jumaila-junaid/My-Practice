import java.util.Scanner;

// Task 08 - Grade calculator.

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the student's marks from the user
        System.out.print("Enter the marks (0-100): ");
        int marks = input.nextInt();

        // Check for invalid marks first, so values outside 0-100 never get a grade
        // Grades: A (75+), B (65+), C (45+), S (35+), F (below 35)
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else if (marks >= 75) {
            System.out.println("The grade is A.");
        } else if (marks >= 65) {
            System.out.println("The grade is B.");
        } else if (marks >= 45) {
            System.out.println("The grade is C.");
        } else if (marks >= 35) {
            System.out.println("The grade is S.");
        } else {
            System.out.println("The grade is F.");
        }

        input.close();

    }
}
