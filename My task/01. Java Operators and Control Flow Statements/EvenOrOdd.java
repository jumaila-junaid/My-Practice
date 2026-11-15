import java.util.Scanner;

// Task 02 - Check whether a number is even or odd.

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // A number is even if it divides by 2 with no remainder
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        input.close();

    }

}
