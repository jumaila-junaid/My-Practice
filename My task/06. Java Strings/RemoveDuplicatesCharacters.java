// Task 07 - Remove duplicate characters from a string, keeping the order.

public class RemoveDuplicatesCharacters {

    public static void main(String[] args) {
        String text = "Programming";
        // convert to lower case
        String lower = text.toLowerCase();
        // unique characters are added here
        String result = "";

        // take each character one by one
        for (int i = 0; i < lower.length(); i++) {
            // reset for every character
            boolean isDuplicate = false;

            // is this character already in result?
            for (int j = 0; j < result.length(); j++) {
                if (lower.charAt(i) == result.charAt(j)) {
                    isDuplicate = true;
                }
            }

            // add only if it is not a duplicate
            if (!isDuplicate) {
                result = result + lower.charAt(i);
            }
        }

        System.out.println("Original: " + text);
        System.out.println("Without duplicates: " + result);
    }
}
