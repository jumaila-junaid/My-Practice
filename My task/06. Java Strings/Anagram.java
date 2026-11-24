// Task 06 - Check whether two strings are anagrams of each other.

public class Anagram {

    public static void main(String[] args) {
        String first = "Listen";
        String second = "Silent";

        // convert to lower case so Listen and Silent are compared fairly
        String lowerFirst = first.toLowerCase();
        String lowerSecond = second.toLowerCase();

        // assume they are anagrams
        boolean isAnagram = true;

        // different lengths can never be anagrams
        if (lowerFirst.length() != lowerSecond.length()) {
            isAnagram = false;
        } else {
            // take each character of the first string
            for (int i = 0; i < lowerFirst.length(); i++) {

                // count this character in the first string
                int count1 = 0;
                for (int j = 0; j < lowerFirst.length(); j++) {
                    if (lowerFirst.charAt(j) == lowerFirst.charAt(i)) {
                        count1++;
                    }
                }

                // count the same character in the second string
                int count2 = 0;
                for (int j = 0; j < lowerSecond.length(); j++) {
                    if (lowerSecond.charAt(j) == lowerFirst.charAt(i)) {
                        count2++;
                    }
                }

                // different counts means not an anagram
                if (count1 != count2) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println(first + " and " + second + " are anagrams.");
        } else {
            System.out.println(first + " and " + second + " are not anagrams.");
        }
    }
}
