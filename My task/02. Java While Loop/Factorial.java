import java.util.Scanner;

// Task 07 - Find the factorial of a number.

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get n from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // no factorial for negative
        // long can hold only up to 20!
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (n > 20) {
            System.out.println("The number is too large. Please enter 20 or less.");
        } else {

            // starts at 1, 0 would make result 0
            long result = 1;
            int counter = 1; // Start counting from 1

            // multiply 1 to n
            while (counter <= n) {
                result = result * counter;

                counter++;
            }

            System.out.println("The factorial of " + n + " is: " + result);

        }

        input.close();
    }
}
