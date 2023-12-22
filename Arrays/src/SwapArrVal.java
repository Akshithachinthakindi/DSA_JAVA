import java.util.Arrays;
import java.util.Scanner;

public class SwapArrVal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array elements before swapping: " + Arrays.toString(arr));

        swap(arr, 1, 2);
        swap(arr, 4, 5);

        System.out.print("Array elements after swapping: ");
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int in, int ind) {
        int temp = arr[in];
        arr[in] = arr[ind];
        arr[ind] = temp;
    }
}
