// Task 08 - Remove duplicate elements from an array.

public class RemoveDuplicates {

    public static void main(String[] args) {
        // original array with duplicates
        int[] numbers = { 15, 25, 15, 35, 25, 45 };
        // new array to store the unique elements (same size)
        int[] unique = new int[numbers.length];
        // number of unique elements stored so far
        int count = 0;

        // take each element of the original array
        for (int i = 0; i < numbers.length; i++) {
            // reset for every element
            boolean isDuplicate = false;

            // check if the element is already in the unique array
            for (int j = 0; j < count; j++) {
                if (numbers[i] == unique[j]) {
                    isDuplicate = true;
                }
            }

            // add only if it is not a duplicate
            if (!isDuplicate) {
                // store at the next free position, then move forward
                unique[count] = numbers[i];
                count++;
            }
        }

        System.out.print("Array without duplicates: ");
        // print only the stored elements (not the empty slots)
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}
