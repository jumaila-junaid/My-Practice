import java.util.Scanner;

// Task 05 - Reverse a given number.

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // save original for output
        int originalNumber = number;

        // reversed starts at 0
        int reversed = 0;

        // repeat till no digits left
        while (number != 0) {
            int lastDigit = number % 10; // get the last digit
            reversed = reversed * 10 + lastDigit; // add it to the end of the reversed number
            number = number / 10; // remove the last digit
        }

        System.out.println("Reverse of " + originalNumber + " is: " + reversed);

        input.close();

    }
}
