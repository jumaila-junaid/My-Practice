import java.util.Scanner;

// Task 03 - Find the sum of all even numbers from 1 to n.

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get n from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // n must be 1 or more
        if (n < 1) {
            System.out.println("Please enter a positive number.");
        } else {

            int sum = 0; // starts the sum from 0
            int number = 1; // start counting from 1

            // repeat till n
            while (number <= n) {
                // even if remainder is 0
                if (number % 2 == 0) {
                    sum = sum + number;
                }

                number++;
            }

            System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);

        }

        input.close();
    }
}
