// Task 03 - Calculate the sum of all elements in an array.

public class SumOfArrayElements {
    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 12, 45, 7, 23, 56 };

        // sum starts at 0
        int sum = 0;

        // go through every element
        for (int i = 0; i < numbers.length; i++) {
            // add the element to sum
            sum = sum + numbers[i];

        }

        System.out.println("The sum of all elements is: " + sum);
    }
}
