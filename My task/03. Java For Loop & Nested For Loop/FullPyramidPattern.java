// Task 04 - Print a pyramid star pattern.

public class FullPyramidPattern {

    public static void main(String[] args) {

        // number of lines in the pattern
        int rows = 5;

        // outer loop: one round for each line
        for (int i = 1; i <= rows; i++) {

            // print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}