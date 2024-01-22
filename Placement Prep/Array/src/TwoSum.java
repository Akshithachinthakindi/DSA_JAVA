import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = in.nextInt();

        System.out.println(Arrays.toString(myfunc(arr, n, target)));
    }
    static int[] myfunc(int[] arr, int n, int target) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}