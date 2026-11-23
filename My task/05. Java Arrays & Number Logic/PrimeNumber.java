import java.util.Scanner;

// Task 09 - Check whether a number is prime.

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // assume prime until a divisor is found
        boolean isPrime = true;

        // numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // try dividing by 2 up to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    // one divisor is enough, stop checking
                    break;
                }
            }
        }

        // show the result after checking
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
