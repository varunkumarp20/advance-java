public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "Was it a car or a cat I saw";

        // Step 1 & 2: normalize string
        String cleaned = input.toLowerCase().replace(" ", "");

        // Step 3: reverse
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Step 4: compare
        if (cleaned.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
