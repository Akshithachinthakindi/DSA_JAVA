package Arrays;

import java.util.*;

public class AliceMessages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = scanner.next();
        }

        int minMessages = findMinMessages(strings);
        System.out.println(minMessages);
    }

    public static int findMinMessages(String[] strings) {
        Set<String> encodedStrings = new HashSet<>();
        int minMessages = 0;

        for (String string : strings) {
            String encoded = encode(string);
            if (!encodedStrings.contains(encoded)) {
                minMessages++;  // Original string needed
                encodedStrings.add(encoded);  // Add encoded version for future checks
            } else {
                encodedStrings.remove(encoded);  // Remove encoded pair, as either original or encoded could be the initial one
            }
        }

        return minMessages + encodedStrings.size();  // Add any remaining encoded strings that weren't paired
    }

    public static String encode(String string) {
        char[] encodedChars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            encodedChars[i] = (char) ('z' - ch + 'a');  // Apply encoding rule
        }
        return new String(encodedChars);
    }
}
