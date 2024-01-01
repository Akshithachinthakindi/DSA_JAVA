import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrRecursion {

//    Program to reverse an array using recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be taken: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array before reversed: "+ Arrays.toString(arr));
        reverse(arr, 0, n-1);
        System.out.println();
        System.out.print("The array after reversed is: " + Arrays.toString(arr));
    }
    static void reverse(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start+1, end-1);
        }
    }
}
