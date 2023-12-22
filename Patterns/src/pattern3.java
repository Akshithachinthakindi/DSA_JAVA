import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the num: ");
        int n = sc.nextInt();
        mypattern3(n);
    }
    static void mypattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        6 6 6 6 6 6

