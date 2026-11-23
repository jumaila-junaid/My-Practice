// Task 05 - Print array elements in reverse order.

public class ReverseOrder {

    public static void main(String[] args) {

        int[] numbers = { 17, 62, 8, 25, 97 };

        System.out.print("Elements in reverse order: ");
        // start from the last index and go backwards to 0
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
