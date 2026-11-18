import java.util.Scanner;

// Task 06 - Check whether a student passes or fails based on marks.

public class StudentPassFail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get marks
        System.out.print("Enter the marks (0-100): ");
        int marks = input.nextInt();

        // marks 0-100, pass mark 35
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else if (marks >= 35) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }

        input.close();
    }
}
