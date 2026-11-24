// Task 10 - Find the longest word in a sentence.

public class LongestWord {

    public static void main(String[] args) {
        String sentence = "I love Java programming";
        // split the sentence into words
        String[] words = sentence.split(" ");

        // assume the first word is the longest
        String longest = words[0];

        // check the other words, starting from the second
        for (int i = 1; i < words.length; i++) {
            // longer than the current longest word?
            if (words[i].length() > longest.length()) {
                // this word is the new longest
                longest = words[i];
            }
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Longest word: " + longest);
    }
}
