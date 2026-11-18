import java.util.Scanner;

// Task 06 - Count the digits in a number.

public class CountDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // save original for output
        int originalNumber = number;

        // counts the digits
        int count = 0;

        // 0 has 1 digit, loop won't run for 0
        if (number == 0) {
            count = 1;
        } else {
            // repeat till no digits left
            while (number != 0) {
                number = number / 10; // remove the last digit

                count++;
            }
        }

        System.out.println("The number " + originalNumber + " has " + count + " digit(s).");

        input.close();
    }
}
