import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the num: ");
        int n = 6;
//        int m = 5;
        mypattern2(n);
    }
    static void mypattern2(int n) {
        for (int i =0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *

