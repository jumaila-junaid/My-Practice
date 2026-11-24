// Task 08 - Count the frequency of each character in a string.

public class FrequencyOfEachCharacter {

    public static void main(String[] args) {
        String text = "Hello";
        // convert to lower case
        String lower = text.toLowerCase();

        System.out.println("Character frequency in \"" + text + "\":");

        // take each character one by one
        for (int i = 0; i < lower.length(); i++) {

            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (lower.charAt(i) == lower.charAt(j)) {
                    // was this character counted before?
                    alreadyChecked = true;
                    break;
                }
            }

            // skip, so each character is printed once
            if (alreadyChecked) {
                continue;
            }

            // counts how many times this character appears
            int count = 0;
            // compare with every character
            for (int j = 0; j < lower.length(); j++) {
                if (lower.charAt(i) == lower.charAt(j)) {
                    count++;
                }
            }

            // print the character and its count
            System.out.println(lower.charAt(i) + " = " + count);
        }
    }
}
