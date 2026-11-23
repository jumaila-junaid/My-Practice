// Task 07 - Find duplicate elements in an array.

public class FindDuplicates {

    public static void main(String[] args) {

        int[] numbers = { 15, 25, 15, 35, 25, 45 };
        // true if a duplicate is found
        boolean found = false;

        // title first, then the duplicates
        System.out.print("Duplicate elements: ");

        // take each element
        for (int i = 0; i < numbers.length; i++) {
            // reset for every element
            boolean alreadyChecked = false;
            // did this value appear before?
            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    alreadyChecked = true;
                }
            }

            // check only new values, so each duplicate prints once
            if (!alreadyChecked) {
                // look for the same value after position i
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.print(numbers[i] + " ");
                        found = true;
                        // one match is enough, stop searching
                        break;
                    }
                }
            }
        }

        // no duplicates were found
        if (!found) {
            System.out.print("none");
        }
        System.out.println();
    }
}
