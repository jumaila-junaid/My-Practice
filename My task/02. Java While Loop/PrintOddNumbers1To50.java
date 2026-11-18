// Task 02 - Print all odd numbers between 1 and 50.

public class PrintOddNumbers1To50 {

    public static void main(String[] args) {
        // Start counting from 1
        int number = 1;

        // Repeat until the number goes past 50
        while (number <= 50) {
            // A number is odd if it leaves a remainder when divided by 2
            if (number % 2 != 0) {
                System.out.println(number);
            }

            number++;
        }
    }
}
