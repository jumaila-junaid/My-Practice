// Task 03 - Count vowels, consonants, digits and special characters in a string.

public class CountCharacters {

    public static void main(String[] args) {
        String text = "Helloworld.123@#!";
        // counters for each type
        int vowels = 0, consonants = 0, digits = 0, special = 0;

        // check every character one by one
        for (int i = 0; i < text.length(); i++) {
            // convert to lower case
            char ch = Character.toLowerCase(text.charAt(i));

            // check letters first, so digits and symbols are not counted as consonants
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }
}
