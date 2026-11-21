// Task 10 - Rotate an array to the right by one position.

public class RotateArrayRight {

    public static void main(String[] args) {

        int[] numbers = { 12, 45, 7, 23, 56 };

        // save the last element
        int last = numbers[numbers.length - 1];

        // shift every element one position to the right
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        // put the saved element at the front
        numbers[0] = last;

        System.out.print("Array after rotation: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
