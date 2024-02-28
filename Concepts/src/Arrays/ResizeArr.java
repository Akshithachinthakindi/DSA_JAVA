package Arrays;

import java.util.Arrays;

public class ResizeArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr = new int[]{1, 2, 3, 4, 5};
        int NewSize = 10;

        System.out.println(Arrays.toString(ResizeArray(arr, NewSize)));

    }
    public static int[] ResizeArray(int[] arr, int n) {
        int[] temp = new int[n];
        for(int i  =0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
