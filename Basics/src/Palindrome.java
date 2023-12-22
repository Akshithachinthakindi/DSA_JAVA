import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int num = sc.nextInt();

//        if (checkPalindromeFunc(num) == num) {
//            System.out.println("The number is Palindrome");
//        }
//        else {
//            System.out.println("The number is not palindrome");
//        }
        System.out.print(checkPalindromeFunc(num));
    }
    static boolean checkPalindromeFunc(int num) {
        int revn = 0, org = num;
        while (num > 0) {
            int ld = num % 10;
            num = num / 10;
            revn = revn * 10 + ld;
        }
        return revn == org;
    }
}
