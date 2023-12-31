import java.util.Scanner;

public class NSum {
    public static void main(String[] args) {
//        this is a program to print the sum of first n Numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("The sum of N numbers is: " + numsum(num));

    }
    static int numsum(int num) {
        int sum = 0;

//        METHOD - 1

//        for (int i = 1; i <= num; i++) {
//            sum = sum + i;
//        }
//        return sum;

//        USING FORMULA --- METHOD -2

        sum = num*(num + 1) / 2;
        return sum;
    }
}
