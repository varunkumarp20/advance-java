import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";

        Map<Character, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first non-repeating character
        boolean found = false;
        for (char ch : str.toCharArray()) {
            if (freq.get(ch) == 1) {
                System.out.println(ch);
                found = true;
                break;
            }
        }

        // Step 3: If none exists
        if (!found) {
            System.out.println("None");
        }
    }
}
