import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = sc.nextInt();
        myfunc(Num);
    }
    static void myfunc (int Num) {
        for (int i = 0; i < Num; i++) {
            for (int j = 0; j < Num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *