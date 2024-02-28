package Practice;

import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <= n; i ++) {
            if ((i%3==0) && (i%5==0)) {
                System.out.println("Fizz Buzz " + i);
            }
            else if(i % 3 ==0) {
                System.out.println("Fizz " + i);
            }
            else if(i%5==0) {
                System.out.println("Buzz " + i);
            }
            else {
                System.out.println(i);
            }
        }
    }
}
