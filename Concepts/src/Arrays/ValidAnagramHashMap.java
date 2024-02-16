package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagramHashMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = in.next();
        System.out.print("Enter string 2: ");
        String s2 = in.next();
        if(!myFunc(s1, s2)) {
            System.out.println(s1+" and " + s2  + " " + "are not anagrams");
        }
        System.out.println(s1+" and "+s2+" "+ "are anagrams");
    }
    static boolean myFunc(String s1, String s2) {
        HashMap<Character, Integer> myHash = new HashMap<>();
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            myHash.put(c, myHash.getOrDefault(c, 0) + 1);
        }
        for (int j = 0; j < s2.length(); j++) {
            char c = s2.charAt(j);
            if (!myHash.containsKey(c)) return false;
            myHash.put(c, myHash.get(c)-1);
            if (myHash.get(c) == 0) {
                myHash.remove(c);
            }
        }
        return myHash.isEmpty();
    }
}
