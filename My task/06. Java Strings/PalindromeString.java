// Task 02 - Check whether a string is a palindrome.

public class PalindromeString {

    public static void main(String[] args) {

        String text = "Madam";
        // convert to lower case
        String lower = text.toLowerCase();
        // reversed string is built here
        String reversed = "";

        // go from the last character to the first
        for (int i = lower.length() - 1; i >= 0; i--) {
            // add each character to the reversed string
            reversed = reversed + lower.charAt(i);
        }

        if (lower.equals(reversed)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }

    }
}
