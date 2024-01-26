import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        k = k%arr.length;
        Reverse(arr, 0, arr.length-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    public static void Reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
