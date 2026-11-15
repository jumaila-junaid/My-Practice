import java.util.Scanner;

// Task 10 - Create a simple calculator using a switch statement.

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        // Read the operator as a single character (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                System.out.println("The sum is: " + (firstNum + secondNum));
                break;

            case '-':
                System.out.println("The difference is: " + (firstNum - secondNum));
                break;

            case '*':
                System.out.println("The product is: " + (firstNum * secondNum));
                break;

            case '/':
                // Division is only possible when the second number is not zero
                if (secondNum != 0) {
                    System.out.println("The division is: " + ((double) firstNum / secondNum));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            // Runs when the operator is not one of + - * /
            default:
                System.out.println("Invalid operator.");
                break;
        }

        input.close();
    }
}
