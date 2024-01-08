import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        insertion_sort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while (j >= 1 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
//            System.out.println("Runs");
        }
    }
}

// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(1)