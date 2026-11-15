import java.util.Scanner;

// Task 12 - Check whether a number is divisible by both 3 and 5.

public class DivisibleByThreeAndFive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Both conditions must be true (&&): divisible by 3 and divisible by 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number " + number + " is divisible by both 3 and 5.");
        } else {
            System.out.println("The number " + number + " is not divisible by both 3 and 5.");
        }

        input.close();
    }

}
