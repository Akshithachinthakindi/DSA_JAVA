import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
//        this is a program to print the Factorial of num
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num =  sc.nextInt();

        System.out.println("The factorial of the num is: " + factnum(num));
    }
    static int factnum(int num) {
        int sum = 1;
        for (int i = num; i >= 1; i--) {
            sum = sum * i;
        }
        return sum;
    }
}
