// Task 09 - Reverse the order of words in a sentence.

public class ReverseTheWordOrder {

    public static void main(String[] args) {
        String sentence = "I love Java programming";
        // split the sentence into words
        String[] words = sentence.split(" ");
        // reversed sentence is built here
        String result = "";

        // go from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            // add the word (the word itself is not reversed)
            result = result + words[i];

            // add a space, but not after the last word
            if (i > 0) {
                result = result + " ";
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed word order: " + result);
    }
}
