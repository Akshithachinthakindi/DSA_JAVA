import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
            myfunc(a, b);
        }
        static void myfunc(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a= a % b;
            else b = b % a;
        }
        if (a == 0) System.out.println("The gcd is: " + b);
        System.out.println("The gcd is: " + a);
    }
}