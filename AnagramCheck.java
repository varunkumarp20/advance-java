import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty room";

        // Step 1 & 2: normalize
        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        // Step 3: length check
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Step 4: sort
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        // Step 5: compare
        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
