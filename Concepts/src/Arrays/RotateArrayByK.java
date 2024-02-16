package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

    }
    public static void swap(int[] arr, int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
