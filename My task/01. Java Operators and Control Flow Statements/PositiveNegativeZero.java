import java.util.Scanner;

// Task 05 - Check whether a number is positive, negative, or zero.

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Check positive first, then negative; otherwise the number is zero
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();

    }
}
