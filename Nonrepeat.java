public class Nonrepeat {
    public static void main(String[] args) {
        String input = "swiss";
        char nonRepeatChar = findFirstNonRepeatingCharacter(input);
        if (nonRepeatChar != 0) {
            System.out.println("First non-repeating character: " + nonRepeatChar);
            
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (char c : str.toCharArray()) {