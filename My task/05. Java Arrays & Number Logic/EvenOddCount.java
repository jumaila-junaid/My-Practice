// Task 03 - Count the number of even and odd elements in an array.

public class EvenOddCount {

    public static void main(String[] args) {
        // array of numbers
        int[] numbers = { 13, 62, 8, 25, 97 };

        // counters start at 0
        int evenCount = 0;
        int oddCount = 0;

        // check every element
        for (int i = 0; i < numbers.length; i++) {
            // even if remainder is 0
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                // otherwise it is odd
                oddCount++;
            }
        }

        System.out.println("Even elements: " + evenCount);
        System.out.println("Odd elements: " + oddCount);

    }
}
