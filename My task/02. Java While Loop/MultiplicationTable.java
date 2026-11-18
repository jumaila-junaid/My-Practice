import java.util.Scanner;

// Task 04 - Print the multiplication table of a given number using a while loop.

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int i = 1;

        // Print the table from 1 up to 12
        while (i <= 12) {

            System.out.println(number + " x " + i + " = " + (number * i));

            i++;
        }

        input.close();
    }

}
