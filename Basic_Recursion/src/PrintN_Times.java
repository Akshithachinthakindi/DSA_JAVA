import java.util.Scanner;

public class PrintN_Times {

    static void myfunc(int i, int num) {
        if (num < i) return;

//        print name N times using recursion
//        System.out.println("Lily");

//        print 1 to n using recursion
//        System.out.println(i);

//        print N to 1 using recursion
        System.out.println(num);

        myfunc(i, num-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = in.nextInt();

        myfunc(1, num);
    }
}
