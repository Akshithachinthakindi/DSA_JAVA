import java.util.Scanner;

public class StringPalindromeRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = in.nextLine();

//        boolean ans = IsPalindrome(0, str);
//        System.out.println(ans);
        System.out.println(IsPalindrome(0, str));

    }
    static boolean IsPalindrome(int i, String str) {
        if (i > str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return IsPalindrome(i+1, str);
    }
}
