import java.util.Scanner;

public class FibonacciUsingRecur {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = in.nextInt();

        //        USING RECURSION
        System.out.print("The fibonacci number of "+n+"th term is: "+fibnum(n));

//        THIS IS A PROGRAM TO PRINT FIBONACCI SERIES TILL Nth TERM (Not using recursion)

////        int n = 5;
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter n: ");
//        int n = in.nextInt();
//        if (n == 0) {
//            System.out.println("The Fibonacci Series up to "+n+"th term:");
//            System.out.print(0);
//        } else {
//            int secondLast = 0;
//            int last = 1;
//            System.out.println("The Fibonacci Series up to "+n+"th term:");
//            System.out.print(secondLast + " " + last + " ");
//            int cur;
//            for (int i = 2; i <= n; i++) {
//                cur = last + secondLast;
//                secondLast = last;
//                last = cur;
//                System.out.print(cur + " ");
//            }
//        }
    }
    static int fibnum (int n) {
        if (n <= 1) return n;

        int last = fibnum(n-1);
        int sec_last = fibnum(n-2);
        return last+sec_last;
    }
}