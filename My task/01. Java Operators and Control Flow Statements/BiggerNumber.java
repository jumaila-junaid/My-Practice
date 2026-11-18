import java.util.Scanner;

// Task 07 - Find the bigger number.

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get two numbers
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        // bigger number, handle equal
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
