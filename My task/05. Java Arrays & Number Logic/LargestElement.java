// Task 01 - Find the largest element in an array.

public class LargestElement {

    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 13, 62, 8, 25, 97 };

        // take first element as largest
        int largest = numbers[0];

        // check the rest one by one
        for (int i = 1; i < numbers.length; i++) {
            // found a bigger one
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest element is: " + largest);
    }
}
