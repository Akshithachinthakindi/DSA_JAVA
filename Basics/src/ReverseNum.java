import java.util.Scanner;

public class ReverseNum {
    public static int main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        int reverseNum = 0;
        while (num != 0) {
            int ld = num % 10;
            num /= 10;
            if (reverseNum > Integer.MAX_VALUE/10 || reverseNum < Integer.MIN_VALUE/10) {
                return 0;
            }
            reverseNum = reverseNum * 10 + ld;
        }
        System.out.println("The reverse Number is: " + reverseNum);
        return num;
    }
}
