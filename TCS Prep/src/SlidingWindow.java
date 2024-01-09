import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter k: ");
        int k = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter arr elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = func(n, k, arr);
        System.out.print(Arrays.toString(result));
    }
    static int[] func(int n, int k, int[] arr) {
        int start = 0, end = 0, curSum = 0;
        int[] result = {0, Integer.MAX_VALUE};

        while (end < n) {
            curSum += arr[end];

            while (curSum > k) {
                curSum -= arr[start];
                start++;
            }
            if (curSum == k && (end - start < result[1] - result[0])) {
                result[0] = start;
                result[1] = end;
            }
            end++;
        }
        if (result[1] == Integer.MAX_VALUE) {
            System.out.println("No solution Found");
        }
        return result;
    }
}
