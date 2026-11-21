// Task 06 - Search for a specific element in an array.

public class SearchElementInArray {
    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 12, 45, 7, 23, 56 };
        // the element to search for
        int target = 23;

        // false until the element is found
        boolean found = false;
        // -1 means not found yet (a valid index is never -1)
        int position = -1;

        // check every element
        for (int i = 0; i < numbers.length; i++) {
            // element matches the target
            if (numbers[i] == target) {
                found = true;
                position = i;
            }
        }

        // show the result after checking all elements
        if (found) {
            System.out.println("Element " + target + " found at index " + position);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
