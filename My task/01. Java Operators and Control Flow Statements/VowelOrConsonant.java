import java.util.Scanner;

// Task 11 - Check whether a character is a vowel or consonant.

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read a single character from the user
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        // Only alphabet letters can be a vowel or a consonant
        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is not a letter.");
        } else {
            // Convert to lowercase so that 'A' and 'a' are handled the same way
            switch (Character.toLowerCase(letter)) {
                // The five vowels share one message (cases are stacked together)
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letter + " is a vowel.");
                    break;
                // Any other letter is a consonant
                default:
                    System.out.println(letter + " is a consonant.");
                    break;
            }
        }

        input.close();

    }
}
