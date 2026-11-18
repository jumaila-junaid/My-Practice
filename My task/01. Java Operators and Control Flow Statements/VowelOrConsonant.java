import java.util.Scanner;

// Task 11 - Check whether a character is a vowel or consonant.

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get a character
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        // letters only
        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is not a letter.");
        } else {
            // lowercase so A and a match
            switch (Character.toLowerCase(letter)) {
                // a e i o u share one message
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letter + " is a vowel.");
                    break;

                default:
                    System.out.println(letter + " is a consonant.");
                    break;
            }
        }

        input.close();

    }
}
