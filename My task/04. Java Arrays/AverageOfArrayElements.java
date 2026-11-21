// Task 04 - Calculate the average of array elements.

public class AverageOfArrayElements {
    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 12, 45, 7, 23, 56 };

        // sum starts at 0
        int sum = 0;
        double avg;

        // add all elements to sum
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // cast to double so the decimal part is kept
        avg = (double) sum / numbers.length;

        System.out.println("The average of all elements is: " + avg);
    }
}
