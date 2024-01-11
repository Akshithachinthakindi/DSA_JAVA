import java.util.Scanner;
public class Hitbullseye01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
         for (int i = 0; i < T; i++) {
             int n = scanner.nextInt(); // Number of terms
              double a = scanner.nextDouble(); // First term
              double r = scanner.nextDouble(); // Common ratio
              double result = gpSum(n, a, r);
              System.out.println(result + "00000");
         }
    }
    public static double gpSum(int n, double a, double r) {
        if (r == 1) {
            return n * a; // Handle special case where common ratio is 1
        } else {
            return a * (1 - Math.pow(r, n)) / (1 - r);
        }
    }
}

//GP_SUM
//        Problem Statement:
//        Write a Program to calculate the sum of n terms of a Geometric Progression when first term is a and common ratio is r.
//
//        Input:
//        The first line of the input contains T denoting the number of testcases. The first line of the test case will be the number of terms of GP and second line contains first term and common ratio.
//
//        Output:
//        For each test case the output will be the sum of n terms of GP.Print the answer upto 6 decimal places.
//
//        Constraints:
//        1 <= T<= 100
//        1 <= N <= 100
//        1 <= a,r <= 100
//
//        Time Limit:
//        1 sec
//
//        Example 1:
//        Input
//        1
//        3
//        3 2
//
//        Output
//        21.000000
//
//        Sample I/O Explanation:
//        first term is 3 second term is 6 third term is 12 sum of first three terms is 21.00000