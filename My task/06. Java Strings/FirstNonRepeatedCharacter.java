// Task 04 - Find the first non-repeated character in a string.

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String text = "Swiss";
        // lower case copy
        String lower = text.toLowerCase();
        // becomes true when a non-repeated character is found
        boolean found = false;

        // take each character one by one
        for (int i = 0; i < lower.length(); i++) {
            // assume this character is not repeated
            boolean repeated = false;

            // compare with every other character
            for (int j = 0; j < lower.length(); j++) {
                // same character at a different position means it is repeated
                if (i != j && lower.charAt(i) == lower.charAt(j)) {
                    repeated = true;
                    // stop at the first one
                    break;
                }
            }

            // first character that is not repeated
            if (!repeated) {
                System.out.println("First non-repeated character: " + text.charAt(i));
                found = true;
                break;
            }
        }

        // no non-repeated character in the string
        if (!found) {
            System.out.println("No non-repeated character found.");
        }
    }
}
