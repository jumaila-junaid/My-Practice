import java.util.Scanner;

// Task 10 - Check whether a number is palindrome.

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the number to check
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // save original, loop changes number
        int originalNumber = number;

        // reversed starts at 0
        int reversed = 0;

        // repeat till no digits left
        while (number != 0) {
            int lastDigit = number % 10; // get the last digit
            reversed = reversed * 10 + lastDigit; // add it to the end of the reversed number
            number = number / 10; // remove the last digit
        }

        // palindrome if same as reverse
        // negative is not palindrome
        if (originalNumber >= 0 && originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        input.close();

    }
}
