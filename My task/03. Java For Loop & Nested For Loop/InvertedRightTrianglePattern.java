// Task 02 - Print an inverted right triangle star pattern.

public class InvertedRightTrianglePattern {

    public static void main(String[] args) {

        // number of lines in the pattern
        int rows = 5;

        // outer loop: one round for each line
        for (int i = 1; i <= rows; i++) {

            // inner loop: stars decrease as i grows
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}