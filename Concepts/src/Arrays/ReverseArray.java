package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};

        ReverseArr(arr1, 0, arr1.length-1);
        ReverseArr(arr2, 0, arr2.length-1);

    }
    static void ReverseArr(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
