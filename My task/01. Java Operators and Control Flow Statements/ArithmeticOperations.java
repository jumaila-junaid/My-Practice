import java.util.Scanner;

//Task 01 - Performs addition, subtraction, multiplication and division of two numbers entered by the user.

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        // Perform and display addition, subtraction and multiplication
        System.out.println("Addition: " + (firstNum + secondNum));

        System.out.println("Subtraction: " + (firstNum - secondNum));

        System.out.println("Multiplication: " + (firstNum * secondNum));

        // Division is only possible when the second number is not zero
        if (secondNum != 0) {
            // (double) cast keeps the decimal part, e.g. 10 / 4 = 2.5
            System.out.println("Division: " + (double) firstNum / secondNum);
        } else {
            System.out.println("Cannot divide by zero");
        }

        input.close();
    }
}
