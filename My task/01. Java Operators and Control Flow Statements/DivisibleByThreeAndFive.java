import java.util.Scanner;

// Task 12 - Check whether a number is divisible by both 3 and 5.

public class DivisibleByThreeAndFive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // both must be true (&&)
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number " + number + " is divisible by both 3 and 5.");
        } else {
            System.out.println("The number " + number + " is not divisible by both 3 and 5.");
        }

        input.close();
    }

}
