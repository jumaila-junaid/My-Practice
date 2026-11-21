// Task 05 - Count the number of even and odd elements in an array.

public class CountEvenAndOddInArray {
    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 12, 45, 7, 23, 56 };

        // counters start at 0
        int evenCount = 0;
        int oddCount = 0;

        // check every element
        for (int i = 0; i < numbers.length; i++) {
            // even if remainder is 0
            if (numbers[i] % 2 == 0) {
                evenCount++;
                // otherwise it is odd
            } else {
                oddCount++;
            }
        }

        System.out.println("Even elements: " + evenCount);
        System.out.println("Odd elements: " + oddCount);

    }
}
