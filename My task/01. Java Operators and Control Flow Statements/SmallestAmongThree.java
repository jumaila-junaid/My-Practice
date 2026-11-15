import java.util.Scanner;

// Task 13 - Find the smallest among three numbers.

public class SmallestAmongThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the three numbers from the user
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNum = input.nextInt();

        // Case 1: only one number is the smallest (compare it with the other two)
        // Case 2: two numbers are equal and smaller than the third
        // Case 3: all three numbers are equal
        if (firstNum < secondNum && firstNum < thirdNum) {
            System.out.println("The smallest number is " + firstNum + ".");
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            System.out.println("The smallest number is " + secondNum + ".");
        } else if (thirdNum < firstNum && thirdNum < secondNum) {
            System.out.println("The smallest number is " + thirdNum + ".");
        } else if (firstNum == secondNum && firstNum < thirdNum) {
            System.out.println("The first and second numbers are equal and smallest.");
        } else if (firstNum == thirdNum && firstNum < secondNum) {
            System.out.println("The first and third numbers are equal and smallest.");
        } else if (secondNum == thirdNum && secondNum < firstNum) {
            System.out.println("The second and third numbers are equal and smallest.");
        } else if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All three numbers are equal.");
        }

        input.close();
    }
}
