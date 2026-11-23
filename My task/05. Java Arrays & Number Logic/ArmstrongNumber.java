import java.util.Scanner;

// Task 11 - Check whether a number is Armstrong (use while loop).

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // save original, because number becomes 0 in the count loop
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

        // temp is used to take digits one by one
        int temp = originalNumber;
        // adds the power of each digit
        int sum = 0;

        // repeat for each digit
        while (temp != 0) {
            // take the last digit
            int lastDigit = temp % 10;

            // reset to 1 for every digit
            int power = 1;
            int times = 1;

            // multiply the digit by itself count times
            while (times <= count) {
                power = power * lastDigit;
                times++;
            }

            sum = sum + power;
            // remove the last digit
            temp = temp / 10;
        }

        // Armstrong if sum equals the original number
        // negative numbers are not Armstrong numbers
        if (originalNumber >= 0 && sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close();
    }
}
