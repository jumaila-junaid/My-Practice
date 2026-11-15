import java.util.Scanner;

// Task 03 - Find the largest of two numbers.

public class LargestOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        // Compare the numbers; the equal case is checked separately
        if (firstNum > secondNum) {
            System.out.println("The largest number is " + firstNum + ".");
        } else if (secondNum > firstNum) {
            System.out.println("The largest number is " + secondNum + ".");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();

    }
}
