// Task 05 - Find all duplicate characters and their occurrence counts.

public class DuplicatesCharacters {

    public static void main(String[] args) {
        String text = "Programming";
        // lower case copy
        String lower = text.toLowerCase();
        // becomes true if any duplicate is found
        boolean found = false;

        // take each character one by one
        for (int i = 0; i < lower.length(); i++) {

            // already counted earlier?
            boolean alreadyChecked = false;

            // check whether this character appeared earlier
            for (int j = 0; j < i; j++) {
                if (lower.charAt(i) == lower.charAt(j)) {
                    alreadyChecked = true;
                    break;
                }
            }

            // already counted, so skip it
            if (alreadyChecked) {
                continue;
            }

            // count how many times this character appears
            int count = 0;

            // compare with every character in the string
            for (int j = 0; j < lower.length(); j++) {
                if (lower.charAt(i) == lower.charAt(j)) {
                    count++;
                }
            }

            // more than once means duplicate
            if (count > 1) {
                System.out.println(lower.charAt(i) + " = " + count + " times");
                found = true;
            }
        }

        // no duplicates in the string
        if (!found) {
            System.out.println("No duplicate characters found.");
        }
    }
}