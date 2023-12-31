import java.util.Scanner;

public class PrintN_Times {

    static void myfunc(int i, int num) {
        if (i > num) return;
        System.out.println(i);
        myfunc(i+1, num);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = in.nextInt();

        myfunc(1, num);
    }
}
