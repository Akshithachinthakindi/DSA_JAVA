import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubble_sort(arr, n);
        System.out.println("The sorted arr is: " + Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr, int n) {
        for (int i = n-1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                return;
            }
            System.out.println("runs");
        }
    }
}

// TIME COMPLEXITY : O(N^2)
// SPACE COMPLEXITY : O(1)