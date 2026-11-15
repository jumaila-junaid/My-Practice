import java.util.Scanner;

// Task 07 - Find the bigger number.

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        // Use if-else to find the bigger number; handle the equal case too
        if (firstNum > secondNum) {
            System.out.println("The number " + firstNum + " is bigger.");
        } else if (secondNum > firstNum) {
            System.out.println("The number " + secondNum + " is bigger.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();

    }
}
