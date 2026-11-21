// Task 08 - Find the second largest element in an array.

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 12, 45, 7, 23, 56 };

        // start with the first two elements
        int largest = numbers[0];
        int secondLargest = numbers[1];

        // make sure largest really is the bigger one
        if (secondLargest > largest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        // check the rest, starting from the 3rd element
        for (int i = 2; i < numbers.length; i++) {
            // found a bigger one
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
                // bigger than the second largest, but not the largest
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }

        }

        System.out.println("The second largest element is: " + secondLargest);
    }
}