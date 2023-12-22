import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int ans = myfunc(n);
        System.out.print(ans);
    }
    static int myfunc(int n) {
        int x = n, count = 0;
        while ( n > 0) {
            int lasdig = n % 10;
            if (x % lasdig == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
