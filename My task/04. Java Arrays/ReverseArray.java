// Task 07 - Reverse an array without using built-in methods.

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = { 12, 45, 7, 23, 56 };

        // start from the first element (first index)
        int left = 0;
        // start from the last element (last index)
        int right = numbers.length - 1;

        // swap until both sides meet in the middle
        while (left < right) {
            // swap using a temp variable (so no value is lost)
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // move both sides towards the middle
            left++;
            right--;
        }

        // print the reversed array
        // print the title first, then the elements on the same line.
        System.out.print("Reversed array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
