// Task 01 - Reverse a given string without using built-in reverse methods.

public class ReverseString {
    public static void main(String[] args) {

        String text = "Java";
        // empty string, the reversed characters are added here
        String reversed = "";

        // start from the last character and go back to the first
        for (int i = text.length() - 1; i >= 0; i--) {
            // get the character at position i
            char ch = text.charAt(i);
            // add it to the end of the new string
            reversed = reversed + ch;
        }

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}