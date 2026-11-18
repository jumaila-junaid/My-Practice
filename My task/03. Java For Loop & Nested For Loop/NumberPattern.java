// Task 03 - Print a number pattern.

public class NumberPattern {
    public static void main(String[] args) {
        
        // number of lines in the pattern
        int rows = 5;

        // outer loop: one round for each line
        for (int i = 1; i <= rows; i++) {

            // inner loop: print the numbers 1 to i in this line
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
