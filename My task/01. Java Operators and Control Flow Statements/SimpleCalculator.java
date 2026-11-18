import java.util.Scanner;

// Task 10 - Create a simple calculator using a switch statement.

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get two numbers
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        // operator as a single character
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        // calculate by operator
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
                // check zero before dividing
                if (secondNum != 0) {
                    System.out.println("The division is: " + ((double) firstNum / secondNum));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
                break;
        }

        input.close();
    }
}
