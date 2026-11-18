import java.util.Scanner;

// Task 10 - Create a menu-driven calculator using a while loop.

public class MenuDrivenCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // choice starts at 0
        int choice = 0;

        // repeat until exit (5)
        while (choice != 5) {

            // Display the menu
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // choices 1 to 4 need two numbers
            if (choice >= 1 && choice <= 4) {
                // Read the two numbers
                // // double for decimal numbers
                System.out.print("Enter first number: ");
                double firstNum = input.nextDouble();
                System.out.print("Enter second number: ");
                double secondNum = input.nextDouble();

                // Perform the calculation that matches the user's choice
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (firstNum + secondNum));
                        break;
                    case 2:
                        System.out.println("Result: " + (firstNum - secondNum));
                        break;
                    case 3:
                        System.out.println("Result: " + (firstNum * secondNum));
                        break;
                    case 4:
                        // check zero before dividing
                        if (secondNum != 0) {
                            System.out.println("Result: " + (firstNum / secondNum));
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Thank you! Goodbye.");
            } else {
                // invalid choice; the menu is shown again
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}
