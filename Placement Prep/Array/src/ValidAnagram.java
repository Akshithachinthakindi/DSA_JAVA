import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = in.next();
        System.out.print("Enter string 2: ");
        String s2 = in.next();
        System.out.print(isAnagram(s1, s2));
    }
    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}
