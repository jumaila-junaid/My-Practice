// Task 05 - Print a diamond star pattern.

public class DiamondPattern {

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

        // second half: reverse pyramid (rows - 1 lines, as the middle line is already
        // printed)
        for (int m = rows - 1; m >= 1; m--) {

            // print spaces
            for (int h = m; h < rows; h++) {
                System.out.print(" ");
            }

            // print stars
            for (int p = 1; p <= 2 * m - 1; p++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
