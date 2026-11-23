// Task 02 - Find the smallest element in an array.

public class SmallestElement {

    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 13, 62, 8, 25, 97 };

        // take first element as smallest
        int smallest = numbers[0];

        // check the rest one by one
        for (int i = 1; i < numbers.length; i++) {
            // found a smaller one
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest element is: " + smallest);
    }
}
