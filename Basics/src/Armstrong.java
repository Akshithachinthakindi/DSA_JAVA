import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        if (armstrong_check(num) == num) {
            System.out.print("this is an armstrong number");
        }
        else {
            System.out.println("This is not an armstrong number");
        }
    }
    static int armstrong_check(int num) {
        int sum = 0;
        int org = num;

        while (num != 0) {
            int ld = num % 10;
            sum = sum + (ld*ld*ld);
            num = num / 10;
        }
        return sum;
    }
}
