import java.util.Scanner;

// Task 09 - Generate Fibonacci series up to n terms.

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get number of terms
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();

        // n must be 1 or more
        if (n < 1) {
            System.out.println("Please enter a positive number.");
        } else {
            // The series starts with 0 and 1
            long first = 0;
            long second = 1;

            // counts printed terms
            int count = 1;

            System.out.println("Fibonacci series with " + n + " terms:");

            // repeat till n terms
            while (count <= n) {
                System.out.print(first + " ");

                // next = sum of previous two
                long next = first + second;

                // move both forward
                first = second;
                second = next;

                count++;
            }

            System.out.println();

        }

        input.close();

    }
}
