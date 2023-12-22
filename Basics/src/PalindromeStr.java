import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String Str = in.nextLine();

        StringBuilder sb = new StringBuilder(Str);
        sb.reverse();
        String revStr = sb.toString();
        if(revStr.equals(Str)) {
            System.out.println("Given String is a Palindrome");
        }
        else {
            System.out.println("Given String is not a Palindrome");
        }
    }
}
