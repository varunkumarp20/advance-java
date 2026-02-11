public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            // Count repeated characters
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append character
                result.append(str.charAt(i));

                // Append count only if > 1
                if (count > 1) {
                    result.append(count);
                }
                count = 1; // reset
            }
        }

        System.out.println(result.toString());
    }
}
